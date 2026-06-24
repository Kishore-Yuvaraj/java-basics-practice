package lesson3;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        System.out.println("a > b  : " + (a > b));
        System.out.println("a == b : " + (a == b));
        System.out.println("a != b : " + (a != b));

        boolean isEven  = (a % 2 == 0);
        boolean isLarge = (a > 8);

        System.out.println("isEven && isLarge : " + (isEven && isLarge));
        System.out.println("isEven || isLarge : " + (isEven || isLarge));
        System.out.println("!isEven           : " + (!isEven));
    }
}