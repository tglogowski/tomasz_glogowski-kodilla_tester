package com.kodilla.bank.homework;

public class CashMachine {

    private int size;
    private int[] transactions;
    private int sum = 0;

    public CashMachine() {

        this.size = 0;
        this.transactions = new int[this.size];
    }

    public void addTransaction(int transaction) {

        size++;
        int[] tempTab = new int[size];
        System.arraycopy(transactions, 0, tempTab, 0, transactions.length);
        tempTab[size - 1] = transaction;
        transactions = tempTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getActualBalance() {

        for (int i = 0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int getHowManyTransactions() {
        return transactions.length;
    }

    public int getTotalPayouts() {

        int count = 0;

        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                count++;
        }
        return count;
    }

    public int getTotalPayments() {

        int count = 0;

        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                count++;
        }
        return count;
    }

    public double getSumOfPayments() {

        double sum = 0;

        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] > 0)
                sum += transactions[i];
        }
        return sum;
    }

    public double getSumOfPayouts() {

        double sum = 0;

        for (int i = 0; i < this.transactions.length; i++) {
            if (transactions[i] < 0)
                sum += transactions[i];
        }
        return sum;
    }
}
