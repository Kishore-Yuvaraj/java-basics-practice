//1.Countdown Timer
//Accept N. Print every integer from N down to 1 on separate lines, then print 'Blast off!' as the final line.
package lesson5.forloop;
import java.util.Scanner;
public class Q1CountdownTimer {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        for (int i = n; i>=1; i--){
            System.out.println(i);
        }
        System.out.println("Blast off!");
    }
}
