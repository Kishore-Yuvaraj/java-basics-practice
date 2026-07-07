//1.Positive Number Validator
//Keep asking for a positive integer, rejecting 0 and negatives with a message. Accept only when the value is positive. Print the total attempt count.
package lesson5.dowhileloop;
import java.util.Scanner;
public class Q1PositiveNumberValidator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0;
        do {
            System.out.println("Enter a number:");
            n= sc.nextInt(); //get user input
            count++; //update the count value to one after the user input
            if(n<=0){  // if the n is negative it print the Message
                System.out.println("No Positive value to proceed.");
            }
        }while (n<=0); //loops works until the n is Negative if the Value is Positive the condition is become false and loop Stops.
        System.out.println("Total attempts: " + count);
        sc.close();

    }
}
