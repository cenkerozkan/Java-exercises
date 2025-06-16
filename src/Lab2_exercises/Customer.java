package Lab2_exercises;

import java.util.Random; 

class RandomIdGenerator{
	public static int generate() {
		Random r = new Random();
		return r.nextInt(11);
	}
}

public class Customer {
	private static int customerId;
	
	static {customerId = RandomIdGenerator.generate();}
	
	public void displayInfo() {
		System.out.println("Customer ID: " + customerId);
	}
	
	public static void main(String args[]) {
		Customer obj = new Customer();
		
		obj.displayInfo();
		
		return;
	}
}
