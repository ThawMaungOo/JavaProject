package SolidPrinciple.LiskovSubstitutionPrinciple;

public class Square extends Quadrangle {
    private final int length;

    public Square(int length) {
        this.length = length;
    }
    @Override
    public int area()
    {
        return this.length*this.length;
    }//concrete class

    public static void main(String[] args) {
        Quadrangle quadrangle1 = new Square(5);
        int area1 = quadrangle1.area();
        System.out.println("Area of a square: " + area1);

        Quadrangle quadrangle2 = new Rectangle(2,5);
        int area2 = quadrangle2.area();
        System.out.println("Area of rectangle: " + area2);
    }


}
