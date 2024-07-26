package Homework1;
public class Company {
    public static adService facebookAdd(String ad) {
        return new Facebook(ad);

    }

    public static adService emailAdd(String ad, String fromEmail) {
        return new Email(ad, fromEmail);
    }

    public static adService printAdd(String ad) {
        return new Print(ad);
    }
}
