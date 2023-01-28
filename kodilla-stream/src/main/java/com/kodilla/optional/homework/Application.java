package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Application {
    static Teacher teacher1;
    static Teacher teacher2;
    static List<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        initTeachers();
        initStudents();
        for (Student student : students) {
            System.out.println(printStudentsList(student));
        }
    }

    public static void initStudents() {

        students.add(new Student("Judy",teacher1));
        students.add(new Student("Andy",null));
        students.add(new Student("Peter",teacher2));
        students.add(new Student("Johny",teacher2));
        students.add(new Student("Ann",null));
    }

    public static void initTeachers() {

        teacher1 = new Teacher("Jerry Brown");
        teacher2 = new Teacher("Steven Keaton");
    }

    public static String printStudentsList(Student student) {

            Optional<Teacher> teacherOptional = Optional.ofNullable(student.getTeacher());
            Teacher teacher = teacherOptional.orElse(new Teacher("<undefined>"));
            return "Student: " + student.getName() + ", teacher: " + teacher.getName();
    }
}
