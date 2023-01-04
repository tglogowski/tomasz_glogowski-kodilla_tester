package com.kodilla.abstracts.homework2;

public class Person {

    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;
    }

    public void checkResponsibilities() {

        System.out.println("Hello. My name is " + firstName + ".");
        System.out.println("I am " + age + " and I am a " + job.jobName() + ".");
        System.out.println("I need to " + job.getResponsibilities() + " for " + job.getSalary() + " PLN per month.");
    }
}