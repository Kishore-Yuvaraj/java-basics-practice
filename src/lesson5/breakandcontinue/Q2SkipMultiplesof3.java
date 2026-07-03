//2.Skip Multiples of 3
//Loop 1 to 50. Use continue to skip every multiple of 3.
//Print all remaining numbers. Print the total skipped count at the end.
package lesson5.breakandcontinue;

public class Q2SkipMultiplesof3 {
    public static void main(String[] args){
        int count=0;
        for(int i=1;i<=50;i++){
            if(i%3==0){
                count++;
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Total Skipped count is: "+count);
    }
}
