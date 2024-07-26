package Homework2;

public class BRD implements Bank{
    private double balance;
    private int numberOfWithraws;

    public BRD(double balance, int numberOfWithraws) {
        this.balance = balance;
        this.numberOfWithraws = numberOfWithraws;
    }


    @Override
    public void deposit(double amount) {
        if(amount > 0){
            balance += amount;
            numberOfWithraws++;
            System.out.println("Deposited " + amount + " to BRD. New balance " + balance);
        }
    }

    @Override
    public void withdraw(double amount) {
        if(amount >0 && amount <=balance){
            balance -= amount;
            numberOfWithraws++;
            System.out.println("Withdraw " + amount + " from BRD. New balance: " + balance);
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
