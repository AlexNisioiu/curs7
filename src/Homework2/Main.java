package Homework2;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {
    public static void main(String[] args) {
        Bank ING = BankAccount.bankAcc("ING" ,5000);
        Bank BT = BankAccount.bankAcc("BT",2000);
        Bank BRD = BankAccount.bankAcc("BRD",1500);

        ING.deposit(350);
        ING.withdraw(700);

        BT.deposit(550);
        BT.withdraw(175);

        BRD.deposit(100);
        BRD.withdraw(1700);

        System.out.println("ING balance " + ING.getBalance());
        System.out.println("ING transactions " + ING.getWithdrawNumbers());

        System.out.println("BT balance " + BT.getBalance());
        System.out.println("BT transactions " + BT.getWithdrawNumbers());

        System.out.println("BRD balance " + BRD.getBalance());
        System.out.println("BRD transactions " + BRD.getWithdrawNumbers());
    }
}
