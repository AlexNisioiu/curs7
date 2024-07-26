package Homework1;

public class Print implements adService{
    private String ad;

    public Print(String ad) {
        this.ad = ad;
    }


    @Override
    public void displayAd() {
        System.out.println("Ad on Print: " + ad);

    }
}
