package Homework3;

public class cat implements AnimalBehave{
    @Override
    public String walk() {
        return "cat-walking";
    }

    @Override
    public String talk() {
        return "meow meow";
    }

    @Override
    public String eat() {
        return "Cat - eating";
    }
}
