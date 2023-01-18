package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    private static int countOfUniqueStamps = 0;
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        initStamps(stamps);
        checkNumberOfStamps(stamps);
    }

    private static void checkNumberOfStamps(Set<Stamp> stamps) {

        if (countOfUniqueStamps == stamps.size())
            System.out.println("Set collection contains " + countOfUniqueStamps + " elements.");
    }

    private static void initStamps(Set<Stamp> stamps) {

        if(stamps.add(new Stamp("Unsinkable Titanic", 30, 23, true))) countOfUniqueStamps++;
        if(stamps.add(new Stamp("Stranger In The Fog", 35, 22, false))) countOfUniqueStamps++;
        if(stamps.add(new Stamp("Strong Assets", 32, 25, false))) countOfUniqueStamps++;
        if(stamps.add(new Stamp("Firm In Their Ambitions", 35, 28, false))) countOfUniqueStamps++;
        if(stamps.add(new Stamp("Unsinkable Titanic", 30, 23, true))) countOfUniqueStamps++;
        if(stamps.add(new Stamp("Strong Assets", 32, 25, false))) countOfUniqueStamps++;
    }
}
