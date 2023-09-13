import java.util.*;
public class A6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Float units,bill;
        System.out.println("enter the unit");
        units=sc.nextFloat();
        if(units<=100){
            bill= 100 * 1.5F;
            System.out.println("bill= " + bill);

        }
        else if(units>100 && units<=200){
            bill= 100 * 1.5F + 100*2.5F;
            System.out.println("bill= " + bill);

        }
        else if(units>200 && units<=300){
            bill= 100 * 1.5F + 100*2.5F + 100*3.5F;
            System.out.println("bill= " + bill);
        }
        else{
        System.out.println("overload");
        }
        sc.close();
    }
    
}
