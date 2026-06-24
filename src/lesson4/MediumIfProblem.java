// Lesson 4 - Medium
// Write a program that takes a student's marks as input and prints
// their grade using this rule:
// 90 and above = O
// 75 to 89     = A
// 60 to 74     = B
// 50 to 59     = C
// below 50     = F
// Also print Pass or Fail.
package lesson4;

import java.util.Scanner;

public class MediumIfProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int studentMark = sc.nextInt();

        if (studentMark >= 90) {
            System.out.println("O Grade");
        } else if (studentMark >= 75) {
            System.out.println("A Grade");
        } else if (studentMark >= 60) {
            System.out.println("B Grade");
        } else if (studentMark >= 50) {
            System.out.println("C Grade");
        } else {
            System.out.println("F Grade");
        }

        if (studentMark >= 50) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}