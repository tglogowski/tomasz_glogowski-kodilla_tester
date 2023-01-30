package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {

    public static void main(String[] args) {

        List<Teacher> teachers = initTeachers();
        List<Student> students = initStudents(teachers);
        for (Student student : students) {
            System.out.println("Student: " + student.getName() + ", teacher: "
                    + student.getTeacher().map(teacher -> teacher.getName()).orElse("<undefined>"));
        }
    }

    public static List<Student> initStudents(List<Teacher> teacher) {

        List<Student> students = new ArrayList<>();
        students.add(new Student("Judy",teacher.get(0)));
        students.add(new Student("Andy",null));
        students.add(new Student("Peter",teacher.get(1)));
        students.add(new Student("Johny",teacher.get(1)));
        students.add(new Student("Ann",null));
        return students;
    }
    public static List<Teacher> initTeachers() {

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(new Teacher("Jerry Brown"));
        teachers.add(new Teacher("Steven Keaton"));
        return teachers;
    }
}
