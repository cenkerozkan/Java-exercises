package Lab1_exercises;


public class StackFullError {
	static int counter;
	
	{
		// Just to not forget about static initializers :D
		counter = 0;
	}
	
	public void recursiveMethod() throws InterruptedException {
		System.out.println("Call number: " + (++counter));
		
		Thread.sleep(100);
		
		this.recursiveMethod();
	}
	
	public static void main(String args[]) {
		StackFullError myObject = new StackFullError();
		
		try {
			myObject.recursiveMethod();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
