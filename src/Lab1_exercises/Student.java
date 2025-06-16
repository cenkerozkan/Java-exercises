package Lab1_exercises;

class Course {
	private String courseName;
	private String courseCode;
	private int credit;
	
	public Course(String courseName, String courseCode) {
		this.courseName = courseName;
		this.courseCode = courseCode;
	}
	
	public Course(String courseName, String  courseCode, int credit) {
		this(courseName, courseCode);
		this.credit = credit;
	}
	
	public String getCourseName() {return courseName;}
	public void setCourseName(String courseName) {this.courseName = courseName;}
	
	public String getCourseCode() {return courseCode;}
	public void setCourseCode(String courseCode) {this.courseCode = courseCode;}
	
	public int getCredit() {return credit;}
	public void setCredit(int credit) {this.credit = credit;}
	
	// For testing purposes.
	public String toString() {
		return new String(this.courseName + this.courseCode + this.credit);
	}
}

public class Student {
	private long id;
	private String name;
	private double gpa;
	private static int totalStudents;
	
	// Only works for the first time when an object 
	// gets loaded into the memory.
	static {totalStudents = 0;}
	
	public Student(long id, String name, double gpa) {
		this.id = id;
		this.name = name;
		this.gpa = gpa;
	}
	
	public void enrollCourse(Course course) {
		System.out.println("Student " + this.name + " has enrolled in " + course.getCourseName());
	}
	
	public static void main(String args[]) {
		Course oopCourse = new Course("Object Oriented Programming", "CMPE225", 5);
		Course plCourse = new Course("Programming Languages", "CMPE325", 6);
		
		Student s1 = new Student(20244710068L, "Cenker Özkan", 2.71);
		Student s2 = new Student(21244710119L, "Ali Al-Fatlawi", 2.04);
		
		s1.enrollCourse(plCourse);
		s2.enrollCourse(oopCourse);
		
		return;
	}

}
