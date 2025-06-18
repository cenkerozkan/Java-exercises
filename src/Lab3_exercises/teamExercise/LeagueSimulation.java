package Lab3_exercises.teamExercise;

import java.util.TreeSet;

public class LeagueSimulation {
	public static void main(String args[]) {
		TreeSet<Team> league = new TreeSet<>();
		
		league.add(new Team("Brighton", 3, 4, 3));
        league.add(new Team("Liverpool", 9, 0, 1));
        league.add(new Team("Manchester City", 5, 2, 3));
        league.add(new Team("Manchester United", 5, 2, 3));

        System.out.println("League Standings\n");
        for (Team team : league) {
            System.out.println(team);
        }
	}
}