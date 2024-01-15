package OOPConcept.Inheritance.Exercise;

public class DemoSquare {
    public static void main(String[] args) {
        Square sq = new Square(4,4);
        Cube1 cb = new Cube1(4,4,6);
        sq.computeSurfaceArea();
        cb.computeSurfaceArea();
    }
}
