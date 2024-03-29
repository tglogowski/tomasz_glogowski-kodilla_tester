package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    CashMachine[] cashMachines = new CashMachine[2];

    @Test
    public void checkTotalBalanceCorrect() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(200);
        cashMachines[0].addTransaction(-300);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(2000);
        cashMachines[1].addTransaction(3000);
        cashMachines[1].addTransaction(-1000);
        cashMachines[1].addTransaction(2000);

        int sum = new Bank(cashMachines).getBalance();

        assertEquals(5900, sum);
    }

    @Test
    public void checkNumberOfPayouts() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(200);
        cashMachines[0].addTransaction(-300);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(2000);
        cashMachines[1].addTransaction(3000);
        cashMachines[1].addTransaction(-1000);
        cashMachines[1].addTransaction(2000);


        int sum = new Bank(cashMachines).getPayouts();

        assertEquals(2, sum);

    }

    @Test
    public void checkNumberOfPayments() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(200);
        cashMachines[0].addTransaction(-300);
        cashMachines[0].addTransaction(5000);
        cashMachines[0].addTransaction(1);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(2000);
        cashMachines[1].addTransaction(3000);
        cashMachines[1].addTransaction(-1000);
        cashMachines[1].addTransaction(2000);

        int sum = new Bank(cashMachines).getPayments();

        assertEquals(6, sum);

    }
    @Test
    public void checkPaymentsAverage_DividedByZero() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(0);
        cashMachines[0].addTransaction(0);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(0);

        double sum = new Bank(cashMachines).getPaymentsAverage();

        assertEquals(0, sum);
    }

    @Test
    public void checkPayoutsAverage_DividedByZero() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(0);
        cashMachines[0].addTransaction(0);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(0);

        double sum = new Bank(cashMachines).getPayoutsAverage();

        assertEquals(0, sum);
    }


    @Test
    public void checkPaymentsAverage() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(200);
        cashMachines[0].addTransaction(100);
        cashMachines[0].addTransaction(300);
        cashMachines[0].addTransaction(400);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(3000);
        cashMachines[1].addTransaction(-3000);
        cashMachines[1].addTransaction(-2000);
        cashMachines[1].addTransaction(2000);

        double sum = new Bank(cashMachines).getPaymentsAverage();

        assertEquals(1000, sum);
    }

    @Test
    public void checkPayoutsAverage() {
        cashMachines[0] = new CashMachine();
        cashMachines[0].addTransaction(200);
        cashMachines[0].addTransaction(-100);
        cashMachines[0].addTransaction(-300);
        cashMachines[0].addTransaction(400);

        cashMachines[1] = new CashMachine();
        cashMachines[1].addTransaction(3000);
        cashMachines[1].addTransaction(-3000);
        cashMachines[1].addTransaction(-200);
        cashMachines[1].addTransaction(2000);

        double sum = new Bank(cashMachines).getPayoutsAverage();

        assertEquals(-900, sum);
    }
}