//2.Count Digits
//Accept N. Count how many digits it has using while + % and /. Handle N=0 as 1 digit.
package lesson5.whileloop;

import java.util.Scanner;

public class Q2CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        if (n == 0) {
            System.out.println("Total Count: 1");
            sc.close();
            return;
        }

        int count = 0;
        while (n > 0) {
            count++;
            n = n / 10;
        }

        System.out.println("Total Count: " + count);
        sc.close();
    }
}