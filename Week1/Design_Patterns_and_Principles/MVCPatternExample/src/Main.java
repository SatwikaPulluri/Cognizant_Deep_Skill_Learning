// File: Main.java

public class Main {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student("Satwika", "S1234", "A");
        StudentView view = new StudentView();

        // Create controller
        StudentController controller = new StudentController(student, view);

        // Initial display
        controller.updateView();

        // Update student data
        controller.setStudentName("Sowmya");
        controller.setStudentGrade("A+");

        // Updated display
        controller.updateView();
    }
}
