

import java.util.Scanner;

public class A7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float dis,Bill;
        System.out.println("Enter the purchsed value");

        Bill =sc.nextFloat();
        if (Bill < 2000){
            System.out.println("No Discount");
        }
        else if(Bill >= 2000){
            dis = Bill - (Bill * .15f);
            System.out.println("bill= " + dis );

        }
        sc.close();
    }
    
}
