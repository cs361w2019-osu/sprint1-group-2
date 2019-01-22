package cs361.battleships.models;




public class Result {

	private AtackStatus result;
	private Square location;
	private Ship ship;

	public AtackStatus getResult() {
		//TODO implement
		return this.result;
		//return null;
	}

	public void setResult(AtackStatus result) {
		//TODO implement
		this.result = result;
	}

	public Ship getShip() {
		//TODO implement
		return this.ship;
		//return null;
	}

	public void setShip(Ship ship) {

		//TODO implement
		this.ship = ship;

	}

	public Square getLocation() {
		//TODO implement

		return this.location;
		//return null;
	}

	public void setLocation(Square square) {
		//TODO implement
		this.location = square;
	}
}
