//3-Option Menu
//Show: 1) Square 2) Cube 3) Exit. Compute and
//print results for options 1 and 2 (accept the number separately). Repeat the menu until Exit is chosen.
package lesson5.dowhileloop;
import java.util.Scanner;
public class Q3OptionMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. Square");
            System.out.println("2. Cube");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter a number: ");
                    int number1 = sc.nextInt();
                    System.out.println("Square = " + (number1 * number1));
                    break;
                case 2:
                    System.out.print("Enter a number: ");
                    int number2 = sc.nextInt();
                    System.out.println("Cube = " + (number2 * number2 * number2));
                    break;
                case 3:
                    System.out.println("Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1, 2, or 3.");
            }
        } while (choice != 3);
        sc.close();
    }
}