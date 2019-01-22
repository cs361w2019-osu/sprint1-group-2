package cs361.battleships.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

import cs361.battleships.models.Ship;
import cs361.battleships.models.Square;

public class Board {

	@JsonProperty ArrayList<Square> boxes;
	@JsonProperty ArrayList<Ship> ships;

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	//creates (x,y) array mapping like so:
	//|(1,A)|(1,B)|(1,C)|
	//|(2,A)|(2,B)|(2,C)|
	//|(3,A)|(3,B)|(3,C)|
	public Board() {
		boxes = new ArrayList<Square>(100);
		ships = new ArrayList<Ship>();
		for(int i = 0; i < 100; i++) {
			boxes.add(new Square(i % 10 + 1, (char)(i / 10 + 65)));
		}
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public boolean placeShip(Ship ship, int x, char y, boolean isVertical) {
		int ship_length = ship.getOccupiedSquares().size();

		boolean placeable = false;

		// ensure entire length of ship is placeable
		if (isVertical) {
			placeable = y + ship_length - 1 <= 'J';
		} else {
			placeable = x + ship_length - 1 <= 10;
		}

		// ensure new ship is inside bounds of board
		placeable = placeable && x >= 1 && x <= 10 && y >= 'A' && y <= 'J';
			
		int xVec = isVertical ? 1 : 0;
		int yVec = isVertical ? 0 : 1;

		Ship newShip = new Ship();

		// add set ship's coordinates while also checking if a ship also exists in the same set of blocks
		for(int i = 0; i < ship.getOccupiedSquares().size(); i++) {
			// Add proper coordinates to ship's squares
			int newX = x + i * xVec;
			char newY = (char) ((int)y + i * yVec);

			for( Ship s : ships ) {
				for ( Square sq : s.getOccupiedSquares() ) {
					//if square is taken by a ship already
					if (sq.getRow() == newX && sq.getColumn() == newY) {
						return false;
					}
				}
			}
				
			newShip.getOccupiedSquares().add(new Square(newX, newY));
		}

		if (!placeable) {
			return false;
		}	

		ships.add(newShip);
		return true;
	}

	/*
	DO NOT change the signature of this method. It is used by the grading scripts.
	 */
	public Result attack(int x, char y) {
		// TODO: Implement
		return null;
	}

	public List<Ship> getShips() {
		return ships;
	}

	public void setShips(List<Ship> ships) {
		this.ships.clear();
		for(Ship s : ships)
			this.ships.add(s);
	}

	public List<Result> getAttacks() {
		//TODO implement
		return null;
	}

	public void setAttacks(List<Result> attacks) {
		//TODO implement
	}
}
