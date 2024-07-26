package Homework1;

public class Email implements adService {
    private String ad;
    private String fromEmail;


    public Email(String ad, String fromEmail) {
        this.ad = ad;
        this.fromEmail = fromEmail;
    }


    @Override
    public void displayAd() {
        System.out.println("Ad on Email: " + ad + " from " + fromEmail);

    }
}
