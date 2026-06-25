//2.Odd Number Printer
//Accept N. Print every odd number from 1 to N inclusive, one per line.
package lesson5.forloop;
import java.util.Scanner;
public class Q2OddNumberPrinter {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for(int i=1;i<=n;i+=2){
            System.out.println(i);
        }
    }
}
