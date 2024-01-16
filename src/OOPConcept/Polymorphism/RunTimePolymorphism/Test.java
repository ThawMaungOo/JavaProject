package OOPConcept.Polymorphism.RunTimePolymorphism;

public class Test {
    public static void main(String[] args) {
        Shape sh1 = new Circle("Orange", 3.4);      //assign subtype obj into super type variable
        Shape sh2 = new Rectangle("Red",4.5,3.5);   //assign subtype obj into super type variable
        System.out.println(sh1);
        System.out.println(sh2);
    }
}
