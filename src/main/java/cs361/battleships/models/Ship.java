package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class Ship {

	@JsonProperty private List<Square> occupiedSquares;

	public Ship() {
		occupiedSquares = new ArrayList<Square>();
	}
	
	public Ship(String kind) {
		int size = 0;
		switch(kind) {
			case "minesweeper":
				size = 2;
				break;
			case "destroyer":
				size = 3;
				break;
			case "battleship":
				size = 4;
				break;
		}
		//create array large enough to hold all squares
		occupiedSquares = new ArrayList<Square>(size);
	}

	public List<Square> getOccupiedSquares() {
		return occupiedSquares;
	}
}
