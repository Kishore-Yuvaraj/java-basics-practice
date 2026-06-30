//5.Largest Digit in N
//Accept N. Find and print the largest single digit it contains using only while loop and % arithmetic.
//(e.g. 4829 → 9)
package lesson5.whileloop;

import java.util.Scanner;

public class Q5LargestDigitsInN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int largest = n % 10;
        n = n / 10;

        while (n > 0) {
            int digit = n % 10;
            if (digit > largest) {
                largest = digit;
            }
            n = n / 10;
        }

        System.out.println("Largest digit is: " + largest);
        sc.close();
    }
}
