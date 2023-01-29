package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {

    static List<Student> students = new ArrayList<>();
    static List<Teacher> teachers = new ArrayList<>();

    public static void main(String[] args) {

        initTeachers();
        initStudents();
        for (Student student : students) {
            System.out.println(printStudentsList(student));
        }
    }

    public static void initStudents() {

        students.add(new Student("Judy",teachers.get(0)));
        students.add(new Student("Andy",null));
        students.add(new Student("Peter",teachers.get(1)));
        students.add(new Student("Johny",teachers.get(1)));
        students.add(new Student("Ann",null));
    }
    public static void initTeachers() {
        teachers.add(new Teacher("Jerry Brown"));
        teachers.add(new Teacher("Steven Keaton"));
    }

    public static String printStudentsList(Student student) {
         return "Student: " + student.getName() + ", teacher: " + student.getTeacher().getName();
    }
}
