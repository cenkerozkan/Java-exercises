package Lab2_exercises.AbstractGoalKeeperExample;

public class GoalKeeper extends FootballPlayer{
	private String name;
	private String surname;
	
	public GoalKeeper(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public String getSurname() {return this.surname;}
	public void setSurname() {this.surname = surname;}
	
	public void play() {
		System.out.println("Goalkeeper " + this.name + " " + this.surname + " caught the ball.");
	}
}