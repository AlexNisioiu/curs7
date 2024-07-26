package Homework2;


public class ING implements Bank{
    private double balance;
    private int numberOfWithraws;

    public ING(double initialBalance, int numberOfWithraws) {
        this.balance = initialBalance;
        this.numberOfWithraws = numberOfWithraws;
    }

    @Override
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            numberOfWithraws++;
            System.out.println("Deposited " + amount + " to ING. New balance: " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount > 0 && amount <= balance){
            balance -= amount;
            numberOfWithraws++;
            System.out.println("Withdrew " + amount + " from ING. New balance: " + balance);
        } else {
            System.out.println("Insufficient funds for withdrew ");
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
