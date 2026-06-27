package lesson5.forloop;

import java.util.Scanner;

public class Q7FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the count: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No terms to print.");
            sc.close();
            return;
        }

        int first = 0;
        int second= 1;


        System.out.print(first);

        if (n == 1) {
            sc.close();
            return;
        }


        System.out.print(" " + second);


        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(" " + next);
            first = second;
            second = next;
        }

        System.out.println();
        sc.close();
    }
}