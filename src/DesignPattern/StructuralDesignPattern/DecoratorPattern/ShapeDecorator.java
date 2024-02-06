package DesignPattern.StructuralDesignPattern.DecoratorPattern;

public abstract class ShapeDecorator implements Shape{
    private Shape decoratedShape;

    public ShapeDecorator(Shape shape){
        this.decoratedShape = shape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
