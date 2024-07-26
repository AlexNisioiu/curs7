package Homework2;

public class BankAccount {

    public static Bank bankAcc(String bank, double initialBalance){
        switch (bank.toUpperCase()) {
            case "ING":
                return new ING(initialBalance, 0);
            case "BT":
                return new BT(initialBalance, 0);
            case "BRD":
                return new BRD(initialBalance, 0);
            default:
                System.out.println("unknown bank ");

        }
        return null;
    }
}
