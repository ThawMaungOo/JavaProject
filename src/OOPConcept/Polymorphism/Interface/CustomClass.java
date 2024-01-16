package OOPConcept.Polymorphism.Interface;

public class CustomClass implements CustomInterface {

    @Override
    public void method1() {
        System.out.println("Abstract method");
    }

    public static void main(String[] args) {
        CustomInterface instance = new CustomClass();
        instance.method1();
        instance.method2();
        CustomInterface.method3();
    }
}
