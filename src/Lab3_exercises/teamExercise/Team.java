package Lab3_exercises.teamExercise;

public class Team implements Comparable<Team>{
	private String name;
	private int win;
	private int draw;
	private int lose;
	
	public Team(String name, int win, int draw, int lose) {
		this.name = name;
		this.win = win;
		this.draw = draw;
		this.lose = lose;
	}

	public int calculatePoints() {
		return (int)(win * 3) + (draw * 1);
	}
	
	@Override
	public int compareTo(Team team) {
		if (this.calculatePoints() > team.calculatePoints()) {
			return -1;
		}
		else if (this.calculatePoints() < team.calculatePoints()) {
			return 1;
		}
		else {
			return this.name.compareTo(team.name);
		}
	}
	
	public String toString() {
		return (String)(this.name + " Win: " + this.win + " - Draw: " + this.draw + " - Lose: " +
				this.lose + " | Total Points: " + this.calculatePoints());
	}
}