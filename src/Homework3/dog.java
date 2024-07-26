package Homework3;

public class dog implements AnimalBehave{
    @Override
    public String walk() {
        return "dog walking";
    }

    @Override
    public String talk() {
        return "woof-woof";
    }

    @Override
    public String eat() {
        return "dog-eating";
    }
}
