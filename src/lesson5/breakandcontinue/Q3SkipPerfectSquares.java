//3.Skip Perfect Squares
//Loop 1 to 100. Use continue to skip every perfect square (1, 4, 9, 16...). Print the count of numbers skipped.
package lesson5.breakandcontinue;

public class Q3SkipPerfectSquares {
    public static void main(String[] args) {
        int count= 0;
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            boolean isPerfectSquare = false;
            // Check whether i is a perfect square
            for (int j = 1; j * j <= i; j++) {
                if (j * j == i) {
                    isPerfectSquare = true;
                    break;
                }
            }
            // Skip perfect squares
            if (isPerfectSquare) {
                count++;
                continue;
            }
            // Print non-perfect-square numbers
            System.out.println(i);
        }
        System.out.println("Perfect squares skipped: " + count);
    }
}