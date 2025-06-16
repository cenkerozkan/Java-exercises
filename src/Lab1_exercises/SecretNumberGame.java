package Lab1_exercises;

import java.util.Scanner;

import java.util.Random;

public class SecretNumberGame {
	// I put this here to make a note for myself.
	// If I don't declare any custom constructor,
	// JVM make the same behind the scenes.
	public SecretNumberGame() {/** Default constructor.**/}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		int userAttempt = 0;
		
		// this one will create a random number between
		// 0 - 100
		int randomNumber = random.nextInt(101);
		System.out.println(randomNumber);
		
		while(userAttempt < 5) {
			System.out.println("Guess the number: ");
			int userGuess = scanner.nextInt();
			
			if (userGuess == randomNumber) {
				System.out.println("YOU WIN!\n");
				return;
			}
			userAttempt++;
		}
		System.out.println("Sorry, you lost the game. The number is: " + randomNumber);
		return;
		
	}
}