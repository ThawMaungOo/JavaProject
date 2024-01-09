package SolidPrinciple.InterfaceSegregationPrinciple;

public class Cube implements Shape, ThreeDShape{
    private final int edge;

    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return Math.pow(edge,3);
    }
}
