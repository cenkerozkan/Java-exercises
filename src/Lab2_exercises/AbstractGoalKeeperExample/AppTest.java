package Lab2_exercises.AbstractGoalKeeperExample;

public class AppTest {
	public static void main(String args[]) {
		// Let's initialize the football field first.
		FootballField newField = new FootballField();
		
		// Let's create one striker and one goal keeper.
		Striker newStriker = new Striker("Lionel", "Messi");
		GoalKeeper newGoalKeeper = new GoalKeeper("Manuel", "Neuer");
		
		newField.playFootball(newGoalKeeper);
		newField.playFootball(newStriker);
	}
}
