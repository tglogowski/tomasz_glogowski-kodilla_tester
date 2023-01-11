package com.kodilla.bank.homework;

public class Bank {

    private int payments, payouts;

    private final CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getBalance() {

        int sum = 0;
        for(int i = 0; i < this.cashMachines.length ; i++)
            sum += cashMachines[i].getActualBalance();

        return sum;
    }

    public int getPayments() {

        for (int i = 0; i < this.cashMachines.length; i++)
            payments += cashMachines[i].getTotalPayments();

        return payments;
    }

    public int getPayouts() {

        for (int i = 0; i < this.cashMachines.length; i++)
            payouts += cashMachines[i].getTotalPayouts();

        return payouts;
    }

    public int getPayoutsAverage() {

        int sum = 0;
        int numberOfPayouts = getPayouts();
        for (int i = 0; i < this.cashMachines.length; i++) {
            sum += cashMachines[i].getSumOfPayouts();
        }
        if(numberOfPayouts != 0)
            return  sum / numberOfPayouts;

        return 0;
    }
        public double getPaymentsAverage() {

        int sum = 0;
        int numberOfPayments = getPayments();
        for (int i = 0; i < this.cashMachines.length; i++)
            sum += cashMachines[i].getSumOfPayments();

        if(numberOfPayments != 0)
            return sum / numberOfPayments;

        return 0;
    }
}