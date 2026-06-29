//1. Reverse Digits
//Accept a positive integer. Reverse its digits using while loop arithmetic only — no String, no array.
//(e.g. 1234 → 4321)
package lesson5.whileloop;

import java.util.Scanner;

public class Q1ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No valid input to proceed.");
            sc.close();
            return;
        }

        int reversed = 0;

        while (n > 0) {
            int lastDigit = n % 10;         // extract last digit
            reversed = reversed * 10 + lastDigit; // shift and place
            n = n / 10;                     // remove last digit
        }

        System.out.println("Reversed: " + reversed);
        sc.close();
    }
}