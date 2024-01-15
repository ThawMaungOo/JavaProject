package OOPConcept.Inheritance.Exercise;

public class Square {
    private final int width;
    private final int height;

    public int getSurfaceArea() {
        return surfaceArea;
    }

    private int surfaceArea;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setSurfaceArea(int surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public void computeSurfaceArea(){
        surfaceArea = width * height;
        System.out.println("The surface area of a square : " + surfaceArea);
    }

}
