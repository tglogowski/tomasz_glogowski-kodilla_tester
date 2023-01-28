package com.kodilla.optional.homework;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ApplicationTestSuite {

    @Test
    public void testIfStudentsListNotEmpty() {
        //given
        //when
            Application.initStudents();
            int result = Application.students.size();
        //then
        assertEquals(5,result);
    }

    @Test
    public void testIfTeacher1Exists() {
        //given
        //when
        Application.initTeachers();
        //then
        assertNotNull(Application.teacher1);
    }

    @Test
    public void testIfTeacher2Exists() {
        //given
        //when
        Application.initTeachers();
        //then
        assertNotNull(Application.teacher2);
    }

    @Test
    public void testWhenTeacherIsNotNull() {
        //given
        Application.initTeachers();
        Student student = new Student("Somebody", new Teacher("The best teacher"));
        //when
        String result = Application.printStudentsList(student);
        //then
        String expected = "Student: Somebody, teacher: The best teacher";
        assertEquals(expected,result);
    }
    @Test
    public void testWhenTeacherIsNull() {
        //given
            Student student = new Student("Somebody", null);
        //when
        String result = Application.printStudentsList(student);
        //then
        String expected = "Student: Somebody, teacher: <undefined>";
        assertEquals(expected,result);
    }
}
