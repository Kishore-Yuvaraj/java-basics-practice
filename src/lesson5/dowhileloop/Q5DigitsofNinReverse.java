//5.Print Digits of N in Reverse
//Accept N. Print each digit from last to first on separate
//lines using do-while and arithmetic only. No String conversion, no array.
package lesson5.dowhileloop;
import java.util.Scanner;
public class Q5DigitsofNinReverse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number:");
        int n=sc.nextInt();
        do {
            int lastDigit=n%10;
            System.out.println(lastDigit);
            n=n/10;
        }while(n!=0);
        sc.close();
    }
}
