package OOPConcept.Polymorphism.Interface;

public class CustomClass2 implements CustomInterface2{

    @Override
    public void method1() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        CustomInterface2 instance = new CustomClass2();
        instance.method1();
        instance.method2();
        CustomInterface2.method3();
    }
}
