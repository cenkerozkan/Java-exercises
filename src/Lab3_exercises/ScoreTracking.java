package Lab3_exercises;

import java.util.ArrayList;

import java.util.HashMap;

public class ScoreTracking {
	public ArrayList<Integer> scoreList;
	
	public ScoreTracking() {scoreList = new ArrayList();}
	
	public static void main(String args[]) {
		ScoreTracking scoreObj = new ScoreTracking();
		
		scoreObj.scoreList.add(10);
		scoreObj.scoreList.add(20);
		scoreObj.scoreList.add(30);
		scoreObj.scoreList.add(40);
		scoreObj.scoreList.add(50);
		
		System.out.println("Scores: " + scoreObj.scoreList);
		
		scoreObj.scoreList.remove(2);
		
		System.out.println("Scores: " + scoreObj.scoreList);
		
		System.out.println("Second Round Score: " + scoreObj.scoreList.get(1));
		
		int totalScore = 0;
		for(int score : scoreObj.scoreList) {
			totalScore += score;
		}
		System.out.println("Total Score: " + totalScore);
		
	}
}