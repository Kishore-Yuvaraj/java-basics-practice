//Sum of Even Numbers Accept N. Compute and print the sum of all even numbers from 1 to N.
package lesson5.forloop;
import java.util.Scanner;
public class Q3SumOfEvenNumbers {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int sum=0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println(sum);
    }
}

