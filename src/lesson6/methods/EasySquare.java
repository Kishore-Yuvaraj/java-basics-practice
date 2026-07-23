package lesson6.methods;

// Easy: Write a method square(int n) that returns n * n. Call it in main for a few numbers.

class Arithmetic {
    public static int square(int n) {
        return n * n;
    }
}

public class EasySquare {
    public static void main(String[] args) {
        int result=Arithmetic.square(5);
        System.out.println(result);
    }
}