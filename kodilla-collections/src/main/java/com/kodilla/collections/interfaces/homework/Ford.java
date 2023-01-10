package com.kodilla.collections.interfaces.homework;


public class Ford implements Car{

    private int actualSpeed;
    private int speedIncrementValue;
    private int speedDecrementValue;

    public Ford(int speedIncrementValue, int speedDecrementValue) {
        this.speedIncrementValue = speedIncrementValue;
        this.speedDecrementValue = speedDecrementValue;
    }
    @Override
    public int getSpeed() {
        return actualSpeed;
    }

    @Override
    public void increaseSpeed() {
        actualSpeed += this.speedIncrementValue;
    }

    @Override
    public void decreaseSpeed() {
        actualSpeed -= this.speedDecrementValue;
    }
}
