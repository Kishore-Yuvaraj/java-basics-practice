//1.Min and Max Without Array
//Accept N, then N integers one by one. Print the maximum and minimum without storing them in an array —
//update both variables on every new input.
package lesson5.forloop;
import java.util.Scanner;

public class Q6MinAndMax {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the count:");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("No numbers to process.");
            return;
        }

        int number = sc.nextInt();  // Read first number to seed max and min, then loop for remaining n-1 numbers

        int max = number;
        int min = number;

        for (int i = 2; i <= n; i++) { // starts at 2 since first number already read

            number = sc.nextInt();

            if (number > max) {
                max = number;
            }

            if (number < min) {
                min = number;
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
        sc.close();
    }
}