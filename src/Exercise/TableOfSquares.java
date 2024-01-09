package Exercise;

public class TableOfSquares {
    public static void main(String[] args) {
        System.out.println("The square values: ");
        squarevalue();
    }

    public static void squarevalue()
    {
        for (int i = 1; i <= 20; i++)
        {
            System.out.println(i + "\t" + (i*i));
        }
    }
}
