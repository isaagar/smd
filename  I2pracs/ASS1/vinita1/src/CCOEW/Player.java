package CCOEW;

public class Player extends People {
	private int number ;
	private Position position ;
	
	public Player(){
		super();
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	@Override
	public String toString() {
		return "Player [number=" + number + ", position=" + position
				+ ", Name =" + getName() + ", Address=" + getAddress()+"]";
	}
	
}
