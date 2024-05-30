package Interfaces;

public class House {
    private int occupants;

    private FoodProvider favoriteRestaurant;

    public House(int occupants, FoodProvider favoriteRestaurant) {
        this.occupants = occupants;
        this.favoriteRestaurant = favoriteRestaurant;
    }

    public void changeFavoriteRestaurany(FoodProvider foodProvider) {
        this.favoriteRestaurant = foodProvider;
    }

    public void orderFood() {
        for (int i = 0; i < occupants; i++) {
            System.out.println(favoriteRestaurant.deliverFood());
        }
    }
}