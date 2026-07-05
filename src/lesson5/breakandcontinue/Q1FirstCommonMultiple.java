//1.First Common Multiple
//Accept M and N. Loop upward from 1 using break at the first integer divisible by both M and N. Print it.
package lesson5.breakandcontinue;
import java.util.Scanner;
public class Q1FirstCommonMultiple {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M: ");
        int m = sc.nextInt();
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        if (m <= 0 || n <= 0) {
            System.out.println("Please enter positive integers.");
            return;
        }
        int i = 1;
        while (true) {
            if (i % m == 0 && i % n == 0) {
                System.out.println("First Common Multiple: " + i);
                break;
            }
            i++;
        }
        sc.close();
    }
}
