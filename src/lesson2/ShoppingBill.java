package lesson2;

public class ShoppingBill {
    public static void main(String[] args) {
        double penPrice  = 20.0;
        double bookPrice = 350.0;
        double bagPrice  = 650.0;

        double total = penPrice + bookPrice + bagPrice;
        boolean isBillAbove500 = (total>500);

        System.out.println("Pen price       : " + penPrice);
        System.out.println("Book price      : " + bookPrice);
        System.out.println("Bag price       : " + bagPrice);
        System.out.println("Total cost      : " + total);
        System.out.println("Bill above 500? : " + isBillAbove500);
    }
}