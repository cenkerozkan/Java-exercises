package Lab2_exercises;

public class Child extends Parent{
	public void instanceMethod() {
		System.out.println("Child instance method called.");
	}
	
	public static void staticMethod() {
		System.out.println("Child static method called.");
	}
	
	public static void main(String args[]) {
		Parent obj1 = new Parent();
		
		obj1.instanceMethod();
		obj1.staticMethod();
		
		Child obj2 = new Child();
		obj2.instanceMethod();
		obj2.staticMethod();
	}
}