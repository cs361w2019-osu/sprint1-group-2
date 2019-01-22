package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private ArrayList<Square> occupiedSquares;

	public Ship() {
		occupiedSquares = new ArrayList<Square>();
	}
	
	public Ship(String kind) {
		int size = 0;
		switch(kind) {
			case "MINESWEEPER":
				size = 2;
				break;
			case "DESTROYER":
				size = 3;
				break;
			case "BATTLESHIP":
				size = 4;
				break;
		}
		//create array large enough to hold all squares
		occupiedSquares = new ArrayList<Square>();

		for(int i = 0; i < size; i++) {
			occupiedSquares.add(new Square(0,(char)64));
		}
	}

	public List<Square> getOccupiedSquares() {
		return occupiedSquares;
	}
}
