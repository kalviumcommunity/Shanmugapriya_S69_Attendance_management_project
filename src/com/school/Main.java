package com.school;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        System.out.println(student);
        System.out.println();
        System.out.println(teacher);
        System.out.println();
        System.out.println(staff);
        System.out.println();

        AttendanceRecord record = new AttendanceRecord(student.getId(), java.time.LocalDate.of(2025, 9, 24), true);
        record.displayRecord();
    }
}
