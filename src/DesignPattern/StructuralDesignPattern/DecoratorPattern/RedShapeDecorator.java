package DesignPattern.StructuralDesignPattern.DecoratorPattern;

public class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape shape) {
        super(shape);
    }

    @Override
    public void draw() {
        super.draw();
        setRedBorder(this);
    }

    public void setRedBorder(Shape shape){
        System.out.println("It's decorated with red border");
    }
}
