package Lab1_exercises;

import java.util.ArrayList;

import java.util.Scanner;

/**
 * Exercise 5: Create a Java program to allow a user to record the activities 
 * he/she does throughout the day. At the end of the day, he/she wants to 
 * combine these activities and put them in a single sentence with a comma between 
 * them (There should be no comma at the end of the text). 
 * 
 * Teacher's solution:
 * --------------------
 *  package ExerciseFive;

	import java.util.Scanner;
	
	public class DailyActivities {
	
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
	
	        System.out.print("How many activities did you do today?: ");
	        int activityCount = scanner.nextInt();
	        
	        scanner.nextLine(); // Consume the newline character
	
	        StringBuilder combinedActivities = new StringBuilder("Today's activities: ");
	        
	        for(int i = 1; i <= activityCount; i++) {
	        	System.out.print("Enter activity " + (i) + ": ");
	        	combinedActivities.append(scanner.nextLine());
	        	
	        	if(i < activityCount) {
	        		combinedActivities.append(", ");
	        	}
	        }
	        
	        System.out.println(combinedActivities.toString());
	        
	        scanner.close();
		}
	}
 **/

public class UserActivity {
	
	public ArrayList<String> activityList;

	public UserActivity() {
		activityList = new ArrayList<String>();
	}

	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		UserActivity userActivityObj = new UserActivity();
		int activityAmount;
		String userActivityTemp;
		
		System.out.println("How many activities did you do today?:");
		activityAmount = scanner.nextInt();
		
		// Take the user input first.
		for(int i = 0; i < activityAmount; i++) {
			System.out.println("Enter activity " + i + ":");
			userActivityTemp = scanner.next();
			userActivityObj.activityList.add(userActivityTemp);
		}
		
		System.out.print("Today's activities: ");
		for (int i = 0; i < userActivityObj.activityList.size(); i++) {
			if(i == activityAmount-1) {
				System.out.print(userActivityObj.activityList.getLast());
				break;
			}
			System.out.print(userActivityObj.activityList.get(i) + ", ");
		}
		return;
	}
}