package baseball.entities;

import baseball.entities.enums.Position;

public class BaseballPlayer {
	private int id;
	private String nameBaseballPlayer;
	private String franchise;
	private Position position;
	
	
	public BaseballPlayer() {}


	public BaseballPlayer(int id, String nameBaseballPlayer, String franchise, Position position) {
		super();
		this.id = id;
		this.nameBaseballPlayer = nameBaseballPlayer;
		this.franchise = franchise;
		this.position = position;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNameBaseballPlayer() {
		return nameBaseballPlayer;
	}


	public void setNameBaseballPlayer(String nameBaseballPlayer) {
		this.nameBaseballPlayer = nameBaseballPlayer;
	}


	public String getFranchise() {
		return franchise;
	}


	public void setFranchise(String franchise) {
		this.franchise = franchise;
	}


	public Position getPosition() {
		return position;
	}


	public void setPosition(Position position) {
		this.position = position;
	}


	@Override
	public String toString() {
		return "BaseballPlayer [id=" + id + ", nameBaseballPlayer=" + nameBaseballPlayer + ", franchise=" + franchise
				+ ", position=" + position + "]";
	}

	
	

	

	
	
	
	

}
