package com.kodilla.collections.adv.maps.homework;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {

        Map<Principal, School> director = new HashMap<>();

        Principal dirPeter = new Principal("Peter", "Jackson");
        Principal dirJohn = new Principal("John", "Elmore");
        Principal dirBarbara = new Principal("Barbara", "Clarckson");

        School schoolSixRoads = new School(Arrays.asList(30,32,28,26,25,27,31), "Six Roads School");
        School schoolFloridaMagnet  = new School(Arrays.asList(23,25,29,19,23,28,26), "Florida Magnet School");
        School schoolTheBoulevard = new School(Arrays.asList(17,21,23,19,20,24,35), "The Boulevard School");

        director.put(dirBarbara, schoolFloridaMagnet);
        director.put(dirPeter, schoolTheBoulevard);
        director.put(dirJohn, schoolSixRoads);

        for (Map.Entry<Principal, School> directorEntry : director.entrySet()) {
            System.out.println("School name : " + directorEntry.getValue().getSchoolName() + " | "
                    + "Current director: " + directorEntry.getKey().toString() + " | "
                    + directorEntry.getValue().toString());
        }
    }
}
