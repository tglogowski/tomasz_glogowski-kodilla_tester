package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private double stampLength;
    private double stampHeight;
    private boolean isStamped;
    private static int[] hashCodes = new int[0];
    private static int counter = 0;
    private static int addsCounter = 0;

    public Stamp(String stampName, double stampLength, double stampHeight, boolean isStamped) {
        this.stampName = stampName;
        this.stampLength = stampLength;
        this.stampHeight = stampHeight;
        this.isStamped = isStamped;
        addsCounter++;
        if (ifNotExistsInCollection())
            addStamp();
    }

    public boolean ifNotExistsInCollection() {
        for (int i = 0; i < counter; i++) {
            if(hashCodes[i] == hashCode()) return false;
        }
        return true;
    }

    private void addStamp() {
        this.counter++;
        int[] tempTab = new int[this.counter];
        System.arraycopy(hashCodes,0,tempTab,0,hashCodes.length);
        tempTab[this.counter -1 ] = hashCode();
        this.hashCodes = tempTab;
    }

    public String getStampName() {
        return stampName;
    }

    public double getStampLength() {
        return stampLength;
    }

    public double getStampHeight() {
        return stampHeight;
    }

    public boolean isStamped() {
        return isStamped;
    }

    public static int getNumberOfUniqueStamps() {
        return counter;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampLength, stampLength) == 0
                && Double.compare(stamp.stampHeight, stampHeight) == 0
                && isStamped == stamp.isStamped
                && Objects.equals(stampName, stamp.stampName);
    }

    public static int getNumberOfRejected() {
        return (addsCounter - counter);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, stampLength, stampHeight, isStamped);
    }

    @Override
    public String toString() {
        return "Stamp{" +
                "stampName='" + stampName + '\'' +
                ", stampLength=" + stampLength +
                ", stampHeight=" + stampHeight +
                ", isStamped=" + isStamped +
                '}';
    }
}
