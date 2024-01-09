package Exercise;

import java.util.Scanner;

public class DigitCheck1 {
    public static void main(String[] args) {
        Character input = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a digit: ");
        input = sc.next().charAt(0);
        if (!Character.isDigit(input))
        {
            System.out.println("The character that you entered is not digit. Please enter digit");

        }
        else {
            System.out.println("Your entered digit");
        }

    }
}
