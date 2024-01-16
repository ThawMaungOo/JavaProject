package OOPConcept.Polymorphism.Interface;

public interface CustomInterface {
    public abstract void method1();
    public default void method2(){
        System.out.println("Default method");
    }
    public static void method3(){
        System.out.println("Static method");
    }
}
