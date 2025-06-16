package Lab2_exercises.studentExercise3;

public interface Student {
	void eligibilityStatus();
	default String goToLibrary() {
		return "I am going to library as a student.";
	}
}