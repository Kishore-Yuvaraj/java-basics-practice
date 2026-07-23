package lesson6.methods;
// Medium: Write a method isPrime(int n) that returns true if the number is prime,
// false otherwise. Call it for numbers 1–20 and print which are prime.
class Prime {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

public class MediumIsPrime {
    public static void main(String[] args) {
        boolean result=Prime.isPrime(7);
        System.out.println(result);
        for (int i = 1; i <= 20; i++) {
            if (Prime.isPrime(i)) {
                System.out.println(i + " is Prime");
            }
        }
    }
}