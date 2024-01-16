package OOPConcept.Polymorphism.RunTimePolymorphism;

public class Circle extends Shape{
    double radius;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
        System.out.println("Circle constructor worked");
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public String toString() {
        return "Circle color is " + getColor() + " and area is " + area();
    }
}
