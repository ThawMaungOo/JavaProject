package OOPConcept.Inheritance.Exercise;

public class Cube1 extends Square{
    private final int depth;

    public Cube1(int width, int height, int depth){
        super(width,height);
        this.depth = depth;
    }

    @Override
    public void computeSurfaceArea(){
        super.setSurfaceArea(2*((super.getWidth()*super.getHeight()) + (super.getWidth()*depth) + (super.getHeight() * depth)));
        System.out.println("The surface area of the cube: " + super.getSurfaceArea());
    }
}
