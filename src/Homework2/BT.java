package Homework2;

import java.util.AbstractMap;

public class BT implements Bank{
    private double balance;
    private int numberOfWithraws;

    public BT(double initialBalance, int numberOfWithraws) {
        this.balance = initialBalance;
        this.numberOfWithraws = numberOfWithraws;
    }


    @Override
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            numberOfWithraws++;
            System.out.println("Deposited " + amount + " to BT. New balance " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount >0 && amount <=balance){
            balance -= amount;
            numberOfWithraws++;
            System.out.println("Withdraw " + amount + " from BT. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdraw");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public int getWithdrawNumbers() {
        return this.numberOfWithraws;
    }
}
