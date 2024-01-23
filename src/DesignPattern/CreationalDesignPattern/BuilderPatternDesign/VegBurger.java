package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public class VegBurger extends Burger{
    @Override
    public String name() {
        return "Vegetable burger";
    }

    @Override
    public float price() {
        return 1.7f;
    }
}
