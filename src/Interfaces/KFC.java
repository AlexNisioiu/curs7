package Interfaces;

public class KFC implements Company, FoodProvider {

    private static int numberOfRestaurants;

    private int numberOfEmployees;

    private int uniqueId;

    private double balance;

    private int deliverdQuantity;

    public static int getNumberOfRestaurants(){
        return numberOfRestaurants;
    }
    public void resetMonth() {
        this.balance = 0;
        this.deliverdQuantity = 0;

    }


    @Override
    public int getNumberOfEmployees() {
        return this.numberOfEmployees;
    }

    @Override
    public int getUniqueId() {
        return this.uniqueId;
    }

    @Override
    public void hire(String person) {
        this.numberOfEmployees++;

    }

    @Override
    public boolean pay(double amount) {
        if (amount < 0) {
            return false;
        }
        this.balance += amount;
        return true;
    }

    @Override
    public String deliverFood() {
        this.balance -= 10;
        this.deliverdQuantity++;
        return "Crispy";
    }

    @Override
    public int getDeliveredQuantity() {
        return this.deliverdQuantity;
    }
}
