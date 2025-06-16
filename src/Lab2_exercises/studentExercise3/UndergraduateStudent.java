package Lab2_exercises.studentExercise3;

public class UndergraduateStudent implements Student{
	private int id;
	private String name;
	private String surname;
	private String department;
	private double gpa;
	
	public UndergraduateStudent(int id, String name, String surname, String department, double gpa) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.department = department;
		this.gpa = gpa;
	}
	
	
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}

	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	public String getSurname() {return surname;}
	public void setSurname(String surname) {this.surname = surname;}
	
	public String getDepartment() {return department;}
	public void setDepartment(String department) {this.department = department;}

	public double getGpa() {return gpa;}
	public void setGpa(double gpa) {this.gpa = gpa;}

	
	public void eligibilityStatus() {
		String statusString = (this.gpa >= 2.5) ? new String(this.name + " " + this.surname + " is a graduate student now!") : 
			new String(this.name + " " + this.surname + " is NOT eligible for graduation.");
		System.out.println(statusString);
	}
}
