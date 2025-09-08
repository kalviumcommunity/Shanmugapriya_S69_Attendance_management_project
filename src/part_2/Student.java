public class Student {
    private static int nextStudentIdCounter = 1;  // auto-increment counter
    private int studentId;
    private String name;

    // Constructor
    public Student(String name) {
        this.studentId = nextStudentIdCounter++;
        this.name = name;
    }
   // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID: " + studentId + ", Name: " + name);
    }
}
