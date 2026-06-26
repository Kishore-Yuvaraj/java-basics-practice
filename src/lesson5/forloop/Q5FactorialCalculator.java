//5. Factorial Calculator
//Accept N. Compute N! using a for loop. Treat N=0 as 1. Print the result.
package lesson5.forloop;
import java.util.*;
public class Q5FactorialCalculator {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factorialValue=1;
        for(int i=n;i>0;i--){
            factorialValue*=i;
            if(i==1){
                System.out.print(i+"=");
            }
            else{
            System.out.print(i+"*");
            }
        }
        System.out.println(factorialValue);
    }
}