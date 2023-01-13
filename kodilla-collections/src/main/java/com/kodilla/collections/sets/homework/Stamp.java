package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp  {
    private String stampName;
    private double stampLength, stampHeight;
    private boolean isStamped ;

    public Stamp(String stampName, double stampLength, double stampHeight, boolean isStamped) {
        this.stampName = stampName;
        this.stampLength = stampLength;
        this.stampHeight = stampHeight;
        this.isStamped = isStamped;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.stampLength, stampLength) == 0
                && Double.compare(stamp.stampHeight, stampHeight) == 0
                    && isStamped == stamp.isStamped
                        && Objects.equals(stampName, stamp.stampName);
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
