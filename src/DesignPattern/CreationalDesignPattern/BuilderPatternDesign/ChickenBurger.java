package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public class ChickenBurger extends Burger{
    @Override
    public String name() {
        return "chicken burger";
    }

    @Override
    public float price() {
        return 2.0f;
    }
}
