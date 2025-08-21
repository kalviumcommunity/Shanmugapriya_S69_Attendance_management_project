public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        Course[] courses = new Course[2];

        students[0] = new Student();
        students[0].setDetails(1, "Alice");

        students[1] = new Student();
        students[1].setDetails(2, "Bob");

        courses[0] = new Course();
        courses[0].setDetails(101, "Mathematics");

        courses[1] = new Course();
        courses[1].setDetails(102, "Computer Science");

        System.out.println("=== Students ===");
        for (Student student : students) {
            student.displayDetails();
        }

        System.out.println("\n=== Courses ===");
        for (Course course : courses) {
            course.displayDetails();
        }
    }
}
