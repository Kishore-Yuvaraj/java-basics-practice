//4.Even Number Gate
//Keep asking for a number.
//Print 'Odd — try again.' for odd inputs. On an even input, print 'Accepted!' and stop. Count and print attempts.
package lesson5.dowhileloop;
import java.util.Scanner;
public class Q4EvenNumberGate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        int count=0;
        do{
            System.out.print("Enter a Number:");
            n= sc.nextInt();
            count++;
            if(n%2!=0){
                System.out.println("Odd - try again.");
            }
            else{
                System.out.println("Accepted!");
                break;
            }

        }while(true);
        System.out.println("Total Attempted: "+count);
        sc.close();
    }
}
