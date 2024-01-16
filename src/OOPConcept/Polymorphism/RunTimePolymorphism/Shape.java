package OOPConcept.Polymorphism.RunTimePolymorphism;

public abstract class Shape {
    String color;
    public abstract double area();
    public abstract String toString();

    public Shape(String color){
        this.color = color;
        System.out.println("Shape constructor worked");
    }

    public String getColor(){
        return color;
    }
}
