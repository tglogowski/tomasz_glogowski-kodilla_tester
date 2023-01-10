package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    CashMachine cashMachine = new CashMachine();
    @Test
    public void shouldHaveZeroLength() {
        int[] values = cashMachine.getTransactions();
        assertEquals(0, values.length);
    }

    @Test
    public void shouldAddNegativeValues() {
        cashMachine.addTransaction(-250);

        int[] values = cashMachine.getTransactions();

        assertEquals(-250,values[0]);
    }

    @Test
    public void shouldAddSeveralValues() {
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(300);

        int[] values = cashMachine.getTransactions();

        assertEquals(200,values[0]);
        assertEquals(-100,values[1]);
        assertEquals(300,values[2]);
        assertEquals(3, values.length);
    }

    @Test

    public void checkIfBalanceIsCorrect() {
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-100);
        cashMachine.addTransaction(-100);

        int balance = cashMachine.getActualBalance();
        assertEquals(0, balance);
    }

    @Test
    public void checkNumberOfTransactions() {
        cashMachine.addTransaction(200);
        cashMachine.addTransaction(-50);
        cashMachine.addTransaction(-120);

        int value = cashMachine.getHowManyTransactions();
        assertEquals(3, value);
    }

}
