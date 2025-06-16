package Lab2_exercises.studentExercise3;

public class AppTest {
    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent(1, "Jack", "Teller", "CMPE", 3.0);
        PhdStudent phdStudent = new PhdStudent(2, "Emma", "Davies", "SE", true);

        System.out.println(undergraduateStudent.goToLibrary());
        System.out.println(phdStudent.goToLibrary());
        System.out.println("*******");
        undergraduateStudent.eligibilityStatus();
        phdStudent.eligibilityStatus();
    }
}