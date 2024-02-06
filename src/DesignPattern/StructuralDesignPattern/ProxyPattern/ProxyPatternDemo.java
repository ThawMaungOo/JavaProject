package DesignPattern.StructuralDesignPattern.ProxyPattern;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("shinshin.gif");
        image.display();
        System.out.println();
        image.display();
    }
}
