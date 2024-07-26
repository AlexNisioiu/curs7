package Homework1;


public class Facebook implements adService{
    private String ad;

    public Facebook(String ad) {
        this.ad = ad;
    }


    @Override
    public void displayAd() {
        System.out.println("Ad on Facebook: " + ad);
    }
}
