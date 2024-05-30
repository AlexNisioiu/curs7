package Interfaces;

public class McDonalds implements Company, FoodProvider {

    private int numberOfEmployees;

    private int uniqueId;

    private double balance;

    private int deliverdQuantity;


    public int getNumberOfEmployees() {
        return 0;
    }

    public int getUniqueId() {
        return 0;
    }

    public void hire(String person) {
        this.numberOfEmployees++;

    }

    public boolean pay(double amount) {
        if (amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    public String deliverFood() {
        this.balance -= 10;
        this.deliverdQuantity++;
        return "Hamburger";
    }

    public int getDeliveredQuantity() {

        return this.deliverdQuantity;
    }
}
