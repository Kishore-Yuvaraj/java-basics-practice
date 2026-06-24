// Lesson 4 - Easy
// Write a program that takes a number as input
// and prints whether it is positive, negative, or zero.
package lesson4;

import java.util.Scanner;

public class EasyIfProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        sc.close();
    }
}