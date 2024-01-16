package OOPConcept.Polymorphism.Interface;

public interface CustomInterface2 {
    public abstract void method1();
    public default void method2(){
        method4();      //method call or method invocation
        method5();      //method call or method invocation
        System.out.println("Method 4 and 5 call finished");
    }
    public static void method3(){
        method5();
        System.out.println("Method 5 call finished");
    }

    private void method4(){
        System.out.println("Private method");
    }
    private static void method5(){
        System.out.println("Private static method");
    }

}
