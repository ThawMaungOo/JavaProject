package OOPConcept.Inheritance.Exercise;

import java.util.Scanner;

public class Cube {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("The cube of the number: " + cube());
    }

    public static int cube(){
        System.out.print("Enter a number: ");
        return (int) Math.pow(sc.nextInt(), 3);

    }

}
