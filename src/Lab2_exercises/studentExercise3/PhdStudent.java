package Lab2_exercises.studentExercise3;

public class PhdStudent implements Student{
	private int id;
	private String name;
	private String surname;
	private String department;
	private boolean isThesisWritten;
	
	public PhdStudent(int id, String name, String surname, String department, boolean isThesisWritten) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.isThesisWritten = isThesisWritten;
	}
	
	public int getId() {return this.id;}
	public void setId(int id) {this.id = id;}
	
	public String getName() {return this.name;}
	public void getName(String name) {this.name = name;}
	
	public String getSurname() {return this.surname;}
	public void setSurname(String surname) {this.surname = surname;}
	
	public String getDepartment() {return this.department;}
	public void setDepartment(String department) {this.department = department;}
	
	public boolean getIsThesisWritten() {return this.isThesisWritten;}
	public void setIsThesisWritten(boolean isThesisWritten) {this.isThesisWritten = isThesisWritten;}
	
	public void eligibilityStatus() {
		String statusString = (this.isThesisWritten == true) ? new String(this.name + " " + this.surname + " is a doctor now!") : 
			new String(this.name + " " + this.surname + " must complete the thesis first!");
		System.out.println(statusString);
	}
}
