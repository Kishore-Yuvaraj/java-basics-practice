// Lesson 1 - Easy
// Write a program that takes a person's name and age as input
// and prints: "Hello [name], you are [age] years old."
package lesson1;

import java.util.Scanner;

public class BasicInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.println("Hello " + name + ", you are " + age + " years old.");

        sc.close();
    }
}