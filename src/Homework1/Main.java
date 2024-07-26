package Homework1;

public class Main {
    public static void main(String[] args) {

        adService facebook = Company.facebookAdd("Reduceri Masive");
        adService email = Company.emailAdd("Cupon de Reduceri", "alex123414@gmail.com");
        adService print = Company.printAdd("2 la pret de 1");


        facebook.displayAd();
        email.displayAd();
        print.displayAd();

    }

}
