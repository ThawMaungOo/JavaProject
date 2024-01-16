package OOPConcept.Polymorphism.RunTimePolymorphism;

public class Rectangle extends  Shape{
    double width;
    double length;

    public Rectangle(String color, double width, double length){
        super(color);
        this.width = width;
        this.length = length;
        System.out.println("Rectangle constructor worked");
    }

    @Override
    public double area() {
        return width * length;
    }

    @Override
    public String toString() {
        return "Rectangle color is " + getColor() + " and the area is " + area();
    }
}
