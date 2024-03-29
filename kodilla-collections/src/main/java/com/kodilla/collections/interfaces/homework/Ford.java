package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Ford implements Car{

    private int actualSpeed = 0;
    private int speedIncrementValue;
    private int speedDecrementValue;

    private static final int MAX_SPEED = 180;

    public Ford(int speedIncrementValue, int speedDecrementValue) {
        this.speedIncrementValue = speedIncrementValue;
        this.speedDecrementValue = speedDecrementValue;
    }

    @Override
    public void increaseSpeed() {

        if (actualSpeed >= MAX_SPEED)
            actualSpeed = MAX_SPEED;
        else actualSpeed += this.speedIncrementValue;
    }

    @Override
    public void decreaseSpeed() {

        if (actualSpeed <= 0)
            actualSpeed = 0;
        else actualSpeed -= this.speedDecrementValue;
    }

    @Override
    public int getSpeed() {
        return actualSpeed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speedIncrementValue == ford.speedIncrementValue && speedDecrementValue == ford.speedDecrementValue;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speedIncrementValue, speedDecrementValue);
    }
}
