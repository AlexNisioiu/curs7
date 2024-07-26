package Interfaces;

public class House {
    private int ocuppants;
    private FoodProvider favoriteRestaurant;

    public House(int ocuppants, FoodProvider favoriteRestaurant) {
        this.ocuppants = ocuppants;
        this.favoriteRestaurant = favoriteRestaurant;
    }

    public void changeFavoriteRestaurant(FoodProvider foodProvider) {
        this.favoriteRestaurant = foodProvider;
    }

    public void orderFood() {
        for (int i = 0; i < ocuppants; i++) {
            System.out.println(favoriteRestaurant.deliverFood());
        }
    }
}
