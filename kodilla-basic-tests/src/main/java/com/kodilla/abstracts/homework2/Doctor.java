package com.kodilla.abstracts.homework2;

public class Doctor extends Job {

    private static final String JOB_NAME = "doctor";

    public Doctor(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String jobName() {
        return JOB_NAME;
    }
}