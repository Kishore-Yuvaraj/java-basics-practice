//Multiplication Table
//Accept N. Print its full multiplication table from N×1 to N×12 in the format 'N × i = result'.
package lesson5.forloop;
import java.util.Scanner;
public class Q4MultiplicationTable {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for (int i=1;i<=12;i++){
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
