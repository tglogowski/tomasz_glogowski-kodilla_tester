package com.kodilla.collections.adv.immutable.homework;

public class Main {
    public static void main(String[] args) {

        Task task = new Task("Do something", 20);
        TaskRecord taskRecord = new TaskRecord("Do nothing",30);

        System.out.println("Task: " + task.getTitle() + " | Duration: " + task.getDuration());
        System.out.println(taskRecord);
    }
}

