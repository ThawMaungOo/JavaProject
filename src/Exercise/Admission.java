package Exercise;

import java.util.Scanner;

public class Admission {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter high school grade point average: ");
        float gda = input.nextFloat();
        System.out.print("Enter admission text score: ");
        int atc = input.nextInt();
        check(gda, atc);
    }

    public static void check(float gda, int atc) {
        if((gda>=3.6 && atc>=60) || (gda>=3.0 && atc>=70) || (gda>=2.6 && atc>=80) || (gda>=2.0 && atc>=90) ){
            System.out.println("Accept");
        }
        else {
            System.out.println("Reject");
        }
    }
}
