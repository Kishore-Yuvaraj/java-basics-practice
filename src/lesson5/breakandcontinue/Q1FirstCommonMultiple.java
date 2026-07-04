//1.First Common Multiple
//Accept M and N. Loop upward from 1 using break at the first integer divisible by both M and N. Print it.
package lesson5.breakandcontinue;
import java.util.Scanner;
public class Q1FirstCommonMultiple {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n= sc.nextInt();
        int i=1;
       while (i>0){
           if(i%m==0 && i%n==0){
               System.out.println("The Common Division number:" +i);
               break;
           }
           i++;
       }
    }
}
