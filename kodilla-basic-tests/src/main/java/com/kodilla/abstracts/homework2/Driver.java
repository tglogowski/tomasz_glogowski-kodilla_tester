package com.kodilla.abstracts.homework2;

public class Driver extends Job {

    private static final String JOB_NAME = "driver";

    public Driver(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String jobName() {
        return JOB_NAME;
    }
}
