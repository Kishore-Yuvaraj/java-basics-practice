//3.Sum of Digits
//Accept N. Sum all its digits using while and arithmetic only. (e.g. 4567 → 22)
package lesson5.whileloop;

import java.util.Scanner;

public class Q3SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("No value to proceed");
            sc.close();
            return;
        }

        int total = 0;
        while (n > 0) {
            int digit = n % 10;
            total += digit;
            n = n / 10;
        }

        System.out.println("Total: " + total);
        sc.close();
    }
}