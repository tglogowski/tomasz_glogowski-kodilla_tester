package com.kodilla.bank.homework;

public class Bank {

    private final CashMachine[] cashMachines;

    public Bank(CashMachine[] cashMachines) {
        this.cashMachines = cashMachines;
    }

    public int getTotalBalance() {

        int sum =0;
        for(int i = 0; i < this.cashMachines.length ; i++) {
            sum += cashMachines[i].getActualBalance();
        }
        return sum;
    }

    public int numberOfPayouts() {

        int[] tempTab;
        int count = 0;

        for(int i = 0; i < this.cashMachines.length  ; i++) {
            tempTab = cashMachines[i].getTransactions();
            for (int j = 0; j < tempTab.length; j++) {
                if (tempTab[j] < 0)
                    count++;
            }
        }
        return count;
    }

    public int numberOfPayments() {
        int[] tempTab;
        int count = 0;

        for(int i = 0; i < this.cashMachines.length  ; i++) {
            tempTab = cashMachines[i].getTransactions();
            for (int j = 0; j < tempTab.length; j++) {
                if (tempTab[j] > 0)
                    count++;
            }
        }
        return count;
    }

    public double payoutsAverage() {
        int[] tempTab;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < this.cashMachines.length  ; i++) {
            tempTab = cashMachines[i].getTransactions();
            for (int j = 0; j < tempTab.length; j++) {
                if (tempTab[j] < 0) {
                    sum += tempTab[j];
                    count++;
                }
            }
        }
        if (count > 0) return (double) sum / count;
        return 0;
    }

    public double paymentsAverage() {
        int[] tempTab;
        int sum = 0;
        int count = 0;

        for(int i = 0; i < this.cashMachines.length  ; i++) {
            tempTab = cashMachines[i].getTransactions();
            for (int j = 0; j < tempTab.length; j++) {
                if (tempTab[j] > 0) {
                    sum += tempTab[j];
                    count++;
                }
            }
        }
        if (count > 0) return (double) sum / count;
        return 0;
    }
}
