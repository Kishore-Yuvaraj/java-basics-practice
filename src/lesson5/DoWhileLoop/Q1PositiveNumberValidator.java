//1.Positive Number Validator
//Keep asking for a positive integer, rejecting 0 and negatives with a message. Accept only when the value is positive. Print the total attempt count.
package lesson5.DoWhileLoop;
import java.util.Scanner;
public class Q1PositiveNumberValidator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0;
        do {
            System.out.println("Enter a number:");
            n= sc.nextInt();
            count++;
            if(n<=0){
                System.out.println("No Positive value to proceed.");
            }
        }while (n<=0);
        System.out.println("Total attempts: " + count);
        sc.close();

    }
}
