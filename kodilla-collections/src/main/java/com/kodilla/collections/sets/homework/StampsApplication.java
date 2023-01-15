package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {

        Set<Stamp> stamps = new HashSet<>();
        initStamps(stamps);
        browseStamps(stamps);
    }

    private static void browseStamps(Set<Stamp> stamps) {
        System.out.println("\nNumber of rejected stamps: " + Stamp.getNumberOfRejected());
        System.out.println("List of stamps: ");
        int i = 0;
        System.out.println("--------------------------------------------------------------------------------------------------");
            if (Stamp.getNumberOfUniqueStamps() == stamps.size())
                for (Stamp stamp : stamps) {
                    i++;
                    System.out.println(i + ". " + stamp);
                    System.out.println("--------------------------------------------------------------------------------------------------");
                }
    }

    private static void initStamps(Set<Stamp> stamps) {

        stamps.add(new Stamp("Unsinkable Titanic", 30, 23, true));
        stamps.add(new Stamp("Stranger In The Fog", 35, 22, false));
        stamps.add(new Stamp("Strong Assets", 32, 25, false));
        stamps.add(new Stamp("Firm In Their Ambitions", 35, 28, false));
        stamps.add(new Stamp("Unsinkable Titanic", 30, 23, true));
        stamps.add(new Stamp("Strong Assets", 32, 25, false));
    }
}
