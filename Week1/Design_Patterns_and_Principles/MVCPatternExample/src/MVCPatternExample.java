// File: MVCPatternExample.java

// Step 2: Model Class
class Student {
    private String name;
    private String id;
    private String grade;

    public Student(String name, String id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getGrade() { return grade; }
    public void setGrade(String grade) { this.grade = grade; }
}

// Step 3: View Class
class StudentView {
    public void displayStudentDetails(String name, String id, String grade) {
        System.out.println("\nStudent Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Grade: " + grade);
    }
}

// Step 4: Controller Class
class StudentController {
    private Student student;
    private StudentView view;

    public StudentController(Student student, StudentView view) {
        this.student = student;
        this.view = view;
    }

    // Model data access methods
    public String getStudentName() { return student.getName(); }
    public void setStudentName(String name) { student.setName(name); }

    public String getStudentId() { return student.getId(); }
    public void setStudentId(String id) { student.setId(id); }

    public String getStudentGrade() { return student.getGrade(); }
    public void setStudentGrade(String grade) { student.setGrade(grade); }

    // Update view
    public void updateView() {
        view.displayStudentDetails(student.getName(), student.getId(), student.getGrade());
    }
}
