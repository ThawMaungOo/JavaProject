package DesignPattern.StructuralDesignPattern.DecoratorPattern;

public class DecoratorPatternDemo {
    public static void main(String[] args) {
        Shape circle = new Circle();
        Shape redDecoratedCircle = new RedShapeDecorator(new Circle());
        Shape redDecoratedRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();

        System.out.println("\nCircle of red border");
        redDecoratedCircle.draw();

        System.out.println("\nRectangle of red border");
        redDecoratedRectangle.draw();
    }
}
