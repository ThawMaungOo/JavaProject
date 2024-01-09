package SolidPrinciple.InterfaceSegregationPrinciple;

public class Cricle implements Shape{
    private final double radius;

    public Cricle(double radius){
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }
}
