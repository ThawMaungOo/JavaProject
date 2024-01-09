package Exercise;

import java.util.Scanner;

public class DigitCheck2 {
        Character input;
        public boolean digitCheck()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter a digit");
            input = sc.next().charAt(0);
            return Character.isDigit(input);
        }

    public static void main(String[] args) {
        DigitCheck2 check2 = new DigitCheck2();
        boolean result = check2.digitCheck();
        if (result)
        {
            System.out.println("It is a digit");
        }
        else
        {
            System.out.println("It is not a digit");
        }
    }
}
