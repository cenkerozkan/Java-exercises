package Lab2_exercises.AbstractGoalKeeperExample;

public class Striker extends FootballPlayer{
	private String name;
	private String surname;
	
	public Striker(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}
	
	public String getName() {return this.name;}
	public void setName(String name) {this.name = name;}
	
	public String getSurname() {return this.surname;}
	public void setSurname(String surname) {this.surname = surname;}
	
	public void play() {
		System.out.println("Striker " + this.name + " " + this.surname + "scored a goal.");
	}
}
