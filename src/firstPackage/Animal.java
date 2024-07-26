package firstPackage;

public class Animal {
    int defaultField;
    private int privateField;
    protected int protectedField;
    public int publicField;

    public int numberOfLegs;

    public static void main(String[] args) {
        Animal a = new Animal();
        a.defaultField = 2;
        a.privateField = 4;
        a.protectedField = 6;
        a.publicField = 7;
    }


}
