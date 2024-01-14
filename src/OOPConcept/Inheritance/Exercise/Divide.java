package OOPConcept.Inheritance.Exercise;

public class Divide {
    public static void main(String[] args) {
        displayResult(5,2);
        displayResult(4,6);
    }

    public static void displayResult(int num1, int num2){
        System.out.println("The quotient of " + num1 + " and " + num2 + " is " + (num1 / num2));
        System.out.println("The remainder of " + num1 + " and " + num2 + " is " + (num1 % num2) + "\n");
    }
}
