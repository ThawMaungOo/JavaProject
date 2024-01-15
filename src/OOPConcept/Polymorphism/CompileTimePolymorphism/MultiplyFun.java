package OOPConcept.Polymorphism.CompileTimePolymorphism;

public class MultiplyFun {
    static double multiply(double a, double b){
        return a * b;
    }

    static int multiply(int a , int b){
        return a * b;
    }

    static int multiply(int a , int b, int c){
        return a * b * c;
    }

    public static void main(String[] args) {
        System.out.println("Multiply method with 2 double arguments " + multiply(3.5,2.4));
        System.out.println("Multiply method with 2 int arguments " + multiply(3,5));
        System.out.println("Multiply method with 3 int arguments " + multiply(4,7,3));
    }
}
