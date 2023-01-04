package com.kodilla.abstracts.homework2;

public class Swimmer extends Job {

    private static final String JOB_NAME = "swimmer";

    public Swimmer(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public String jobName() {
        return JOB_NAME;
    }
}
