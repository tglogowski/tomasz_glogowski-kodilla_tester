package com.kodilla.bank.homework;

public class CashMachine {

    private int size;
    private int[] transactions;
    private int sum = 0;

    public CashMachine() {

        this.size = 0;
        this.transactions = new int[this.size];
    }

    public void addTransaction(int cash) {

        size++;
        int[] tempTab  = new int[size];
        System.arraycopy(transactions,0, tempTab,0, transactions.length);
        tempTab[size -1] = cash;
        transactions = tempTab;
    }

    public int[] getTransactions() {
        return transactions;
    }

    public int getActualBalance() {

        for (int i =0; i < transactions.length; i++) {
            sum += transactions[i];
        }
        return sum;
    }

    public int getHowManyTransactions() {
        return transactions.length;
    }
}