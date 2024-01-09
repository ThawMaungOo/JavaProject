package SolidPrinciple.InterfaceSegregationPrinciple;

public class ISPTest {
    public static void main(String[] args) {
        Shape shape1 = new Cricle(10);
        Cube shape2 = new Cube(4);
        System.out.println("Area of shape1: " + shape1.area());
        System.out.printf("Area of a cube: %10f \nVolume of a cube: %10f", shape2.area(), shape2.volume());
    }
}
