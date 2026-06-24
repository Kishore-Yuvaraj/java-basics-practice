// Lesson 4 - Hard
// Write a program that takes a person's age as input and prints
// which category they fall into:
// below 13       = Child
// 13 to 17       = Teenager
// 18 to 59       = Adult (also print: Eligible to vote)
// 60 to 100      = Senior Citizen (also print: Eligible to vote
//                  and Eligible for senior citizen benefits)
// anything else  = Invalid input
package lesson4;

import java.util.Scanner;

public class HardIfProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age >= 0 && age < 13) {
            System.out.println("Child");
        } else if (age >= 13 && age <= 17) {
            System.out.println("Teenager");
        } else if (age >= 18 && age <= 59) {
            System.out.println("Adult");
            System.out.println("Eligible to vote");
        } else if (age >= 60 && age <= 100) {
            System.out.println("Senior Citizen");
            System.out.println("Eligible to vote");
            System.out.println("Eligible for senior citizen benefits");
        } else {
            System.out.println("Invalid input");
        }

        sc.close();
    }
}