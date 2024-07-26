package Homework3;

public class Duck implements AnimalBehave{
    @Override
    public String walk() {
        return "Duck walking";
    }

    @Override
    public String talk() {
        return "Duck talking";
    }

    @Override
    public String eat() {
        return "Duck eating";
    }
}
