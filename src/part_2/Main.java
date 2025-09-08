public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[4];
        Course[] courses = new Course[3];

        // Create students using constructor
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");
        students[2] = new Student("Charlie");
        students[3] = new Student("Diana");

        // Create courses using constructor
        courses[0] = new Course("Mathematics");
        courses[1] = new Course("Computer Science");
        courses[2] = new Course("Physics");

        System.out.println("=== Students ===");
        for (Student student : students) {
            student.displayDetails();
        }
  // Display course details
        System.out.println("\n=== Courses ===");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
