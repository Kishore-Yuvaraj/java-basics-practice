package lesson5.forloop;

import java.util.Scanner;

public class Q8AllDivisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No value to process.");
            sc.close();
            return;
        }

        int count = 0;

        System.out.print("Divisors: ");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Total divisors: " + count);

        sc.close();
    }
}