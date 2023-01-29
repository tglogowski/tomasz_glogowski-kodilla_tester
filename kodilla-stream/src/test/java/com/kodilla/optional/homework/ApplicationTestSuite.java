package com.kodilla.optional.homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {


    @Test
    public void testIfStudentsListNotEmpty() {
        //given
        //when
        Application.initTeachers();
        Application.initStudents();
        int result = Application.students.size();
        //then
        assertEquals(5, result);
    }

    @Test
    public void testIfTeachersListNotEmpty() {
        //given
        //when
        int result = Application.teachers.size();
        //then
        assertEquals(2, result);
    }

    @Test
    public void testWhenTeacherIsNotNull() {
        //given
        Student student = new Student("Somebody", new Teacher("The best teacher"));
        //when
        String result = Application.printStudentsList(student);
        //then
        String expected = "Student: Somebody, teacher: The best teacher";
        assertEquals(expected, result);
    }

    @Test
    public void testWhenTeacherIsNull() {
        //given
        Student student = new Student("Somebody", null);
        //when
        String result = Application.printStudentsList(student);
        //then
        String expected = "Student: Somebody, teacher: <undefined>";
        assertEquals(expected, result);
    }
}
