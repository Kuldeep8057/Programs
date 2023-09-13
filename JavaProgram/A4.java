import java.util.*;
public class A4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("enter the value of a and b");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("before swapping value of a and b " + a +"   "+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("before swapping value of a and b " + a +"   "+ b);
    sc.close();

    }
}
