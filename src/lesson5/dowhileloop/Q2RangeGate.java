//2.Range Gate [1–10] Keep prompting until the user enters an integer in [1, 10] inclusive.
//Print 'Valid!' and the total attempt count when they succeed.
package lesson5.dowhileloop;

import java.util.Scanner;

public class Q2RangeGate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        int count = 0;

        do {
            System.out.print("Enter a number [1-10]: ");
            n = sc.nextInt();
            count++;

            if (n >= 1 && n <= 10) {
                System.out.println("Valid!");
            } else {
                System.out.println("Invalid. Try again.");
            }

        } while (n < 1 || n > 10);

        System.out.println("Total attempts: " + count);
        sc.close();
    }
}