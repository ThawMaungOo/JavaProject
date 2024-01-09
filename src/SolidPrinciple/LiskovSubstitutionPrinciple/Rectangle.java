package SolidPrinciple.LiskovSubstitutionPrinciple;

public class Rectangle extends Quadrangle{
    private final int width;
    private final int height;


    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public int area() {
        return this.width *this.height;
    }
}
