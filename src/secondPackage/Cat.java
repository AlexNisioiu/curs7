package secondPackage;

import firstPackage.Animal;

public class Cat extends Animal {
    public int numberOfLegs;
    public void cat(String[] args) {
        this.protectedField = 5;
        this.publicField = 10;

    }
}
