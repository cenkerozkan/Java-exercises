package Lab3_exercises;

import java.util.HashMap;

public class StudentClassHashMap {
	public static void main(String[] args) {
		// Let's create a HashMap
		HashMap<String, Integer> students = new HashMap();
		
		students.put("Nigel", 85);
		students.put("Emma",78);
		students.put("Lucy", 92);
		
		System.out.println("Grades: " + students);
		
		students.put("Emma", 95);
		System.out.println("Grades: " + students);
		
		students.putIfAbsent("Emma", 31);
		System.out.println("Grades: " + students);
	}
}