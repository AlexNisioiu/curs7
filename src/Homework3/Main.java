package Homework3;

public class Main {
    public static void main(String[] args) {

        dog d = new dog();
        System.out.println(d.talk());
        System.out.println(d.walk());
        System.out.println(d.eat());

        cat c = new cat();
        System.out.println(c.talk());
        System.out.println(c.walk());
        System.out.println(c.eat());

        Mouse m = new Mouse();
        System.out.println(m.talk());
        System.out.println(m.walk());
        System.out.println(m.eat());

        Chicken chicken = new Chicken();
        System.out.println(chicken.talk());
        System.out.println(chicken.walk());
        System.out.println(chicken.eat());

        Duck duck = new Duck();
        System.out.println(duck.talk());
        System.out.println(duck.walk());
        System.out.println(duck.eat());

    }
}
