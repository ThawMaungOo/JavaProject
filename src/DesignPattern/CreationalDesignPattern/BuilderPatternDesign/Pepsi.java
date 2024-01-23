package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public class Pepsi extends CoolDrink{

    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 0.35f;
    }
}
