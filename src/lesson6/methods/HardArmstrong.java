package lesson6.methods;
//Write a method sumOfDigits(int n) (use your shift-and-add pattern from Lesson 5!) that returns the sum of
//digits of a number. Then write a second method isArmstrong(int n) that uses digit logic to check if a number is
//an Armstrong number (e.g., 153 = 1³+5³+3³).

class Maths {
    public static boolean isArmstrong(int n) {
        int original = n;
        int digitCount = String.valueOf(n).length();
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum = sum + (int) Math.pow(digit, digitCount);
            n = n / 10;
        }
        return original == sum;
    }
}

public class HardArmstrong {
    public static void main(String[] args) {
        boolean result=Maths.isArmstrong(153);
        System.out.println(result);

    }
}