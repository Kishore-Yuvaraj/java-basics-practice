//4.Palindrome Number Check
//Accept N. Reverse its digits arithmetically and compare to the original. Print whether it is a palindrome.
//Do not use String or arrays.
package lesson5.whileloop;
import java.util.Scanner;
public class Q4PalindromeNumberCheck {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        n=Math.abs(n); //Math.abs() is a method in the java.lang.Math class used to convert a negative value to its positive equivalent (absolute value).
        int originalNumber=n;
        int reverseNumber=0;
        while(n>0){
            int digit=n%10;
            reverseNumber=reverseNumber * 10+ digit;
            n=n/10;
        }
        if (originalNumber == reverseNumber) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");}
        sc.close();
    }
}