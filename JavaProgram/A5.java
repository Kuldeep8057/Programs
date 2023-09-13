

import java.util.Scanner;

public class A5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a,b,c,avg;
        System.out.print("a= ");
        a =sc.nextInt();
        System.out.print("b= ");
        b =sc.nextInt();
        System.out.print("c= ");
        c =sc.nextInt();
        avg = (a+b+c)/3;
        System.out.println("average of a,b,c = " + avg);
        sc.close();
    }
    
}
