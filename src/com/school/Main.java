package com.school;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "10th Grade");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        student.displayDetails();
        System.out.println();
        teacher.displayDetails();
        System.out.println();
        staff.displayDetails();
        System.out.println();

        AttendanceRecord record = new AttendanceRecord(student.getId(), "2025-09-24", true);
        record.displayRecord();
    }
}
