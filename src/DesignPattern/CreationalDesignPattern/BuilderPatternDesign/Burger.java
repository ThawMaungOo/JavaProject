package DesignPattern.CreationalDesignPattern.BuilderPatternDesign;

public abstract class Burger implements Item{


    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
