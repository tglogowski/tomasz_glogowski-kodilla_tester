package com.kodilla.abstracts.homework2;

public class Doctor extends Job {

    private static final String JOB_NAME = "doctor";
    private int salary;
    private String responsibilities;

    public Doctor(int salary, String responsibilities) {
        super(salary, responsibilities);
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    @Override
    public String getResponsibilities() {
        return responsibilities;
    }

    @Override
    public int getSalary() {
        return salary;
    }

    @Override
    public String jobName() {
        return JOB_NAME;
    }
}