package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public abstract class CoolDrink implements Item{
    @Override
    public Packing packing() {
        return new Bottle();
    }
}
