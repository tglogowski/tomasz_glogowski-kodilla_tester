package com.kodilla.basic_assertion;

public class PrimeChecker {

    public boolean isPrime(int number) {

        if(number >= 2) {
            for (int i = 2; i < number; i++)
                if (number % i == 0) return false;
        }
        else return false;

        return true;
    }
}
