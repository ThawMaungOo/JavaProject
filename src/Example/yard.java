package Example;

public class yard   {
    float width;
    float length;

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public yard(float width, float length) {
        this.width = width;
        this.length = length;
    }

    public void calculateCost() {
        float sqfeet = width * length;
        float yard = sqfeet / 9.0f;
        float priceYard = 10.5f;
        float amount = yard * priceYard;
        System.out.println("Carpeting cost for the whole room: " + amount);
    }

    public static void main(String[] args) {
        yard yard = new yard(42, 25);
        yard.calculateCost();
    }
}
