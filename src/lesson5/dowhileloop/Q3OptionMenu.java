//3-Option Menu
//Show: 1) Square 2) Cube 3) Exit. Compute and
//print results for options 1 and 2 (accept the number separately). Repeat the menu until Exit is chosen.
package lesson5.dowhileloop;
import java.util.Scanner;
public class Q3OptionMenu {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n;
        do {
            System.out.println("1) Square");
            System.out.println("2) Cube");
            System.out.println("3) Exit");
            System.out.print("Enter your Choice: ");
            n=sc.nextInt();
            if (n == 1 || n == 2) {
                System.out.print("Enter a Number: ");
                int a = sc.nextInt();

                if (n == 1) {
                    System.out.println(a * a);
                } else {
                    System.out.println(a * a * a);
                }
            }
            else if (n==3) {
                System.out.println("Exit");
            }
            else {
                System.out.println("Invalid Choice");
            }

        }while(n!=3);
        sc.close();
    }
}
