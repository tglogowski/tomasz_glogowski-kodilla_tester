package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class School {
    private List<Integer> studentList = new ArrayList<>();
    private String schoolName;

    public String getSchoolName() {
        return schoolName;
    }

    public School(List<Integer> studentList, String schoolName) {
        this.studentList = studentList;
        this.schoolName = schoolName;
    }

    public int getTotalAmountsOfStudents() {
        int sum = 0;
        for(int classSize : studentList)
            sum += classSize;
        return sum;
    }

    @Override
    public String toString() {
        return "Total students is equal " + getTotalAmountsOfStudents() + ".";
    }
}
