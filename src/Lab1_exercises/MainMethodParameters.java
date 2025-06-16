package Lab1_exercises;

public class MainMethodParameters {
	public static void main(String args[]) {
		// Create a for loop for the size of args array
		for(int i = 0; i < args.length; i++) {
			System.out.println("Arg " + i + ": " + args[i]);
		}
		return;
	}
}
