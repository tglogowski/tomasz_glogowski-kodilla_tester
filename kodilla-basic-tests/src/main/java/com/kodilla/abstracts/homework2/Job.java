package com.kodilla.abstracts.homework2;

public abstract class Job {

    public Job(int salary, String responsibilities) {
    }

    public abstract String getResponsibilities();

    public abstract int getSalary();

    public abstract String jobName();
}
