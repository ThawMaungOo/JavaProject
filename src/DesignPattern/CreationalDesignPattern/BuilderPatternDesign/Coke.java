package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public class Coke extends CoolDrink{
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 0.4f;
    }
}
