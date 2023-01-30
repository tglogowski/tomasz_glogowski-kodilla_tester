package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {

    List<Teacher> teachers = Application.initTeachers();
    List<Student> students = Application.initStudents(teachers);

    @Test
    public void testIfStudentsListNotEmpty() {
        //given
        //when
        int result = students.size();
        //then
        assertEquals(5, result);
    }

    @Test
    public void testIfTeachersListNotEmpty() {
        //given
        //when
        int result = teachers.size();
        //then
        assertEquals(2, result);
    }

    @Test
    public void testWhenTeacherIsNotNull() {
        //given
        Student student = new Student("Somebody", new Teacher("The best teacher"));
        //when
        String result = student.getTeacher().orElse(new Teacher("<undefined>")).getName();
        //then
        String expected = "The best teacher";
        assertEquals(expected, result);
    }

    @Test
    public void testWhenTeacherIsNull() {
        //given
        Student student = new Student("Somebody", null);
        String result = student.getTeacher().orElse(new Teacher("<undefined>")).getName();
        //when
        String expected = "<undefined>";
        assertEquals(expected, result);
    }
}
