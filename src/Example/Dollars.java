package Example;

import java.util.Scanner;

public class Dollars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The conversion dollar amount: ");
        int amount = sc.nextInt();
        conversion(amount);
    }

    private static void conversion(int amount) {
        int twenty = amount / 20;
        amount %= 20;
        int ten = amount / 10;
        amount %= 10;
        int five = amount / 5;
        int one = amount % 5;
        System.out.println("The number of $20: " + twenty );
        System.out.println("The number of $10: " + ten);
        System.out.println("The number of $5: " + five);
        System.out.println("The number of $1: " + one);
    }
}
