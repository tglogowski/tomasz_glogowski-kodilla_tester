package com.kodilla.optional.homework;

import java.util.Optional;

public class Student {
    String name;
    Teacher teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = teacher;
    }

    public String getName() {
        return name;
    }

    public Optional<Teacher> getTeacher() {
        return Optional.ofNullable(teacher);
    }
}