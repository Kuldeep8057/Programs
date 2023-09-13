

import java.util.Scanner;

public class A11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0 , b=1,i=0;
        int temp=0;
        System.out.println("Enter the range the fibbonachi series");
        int n = sc.nextInt();
        System.out.print(a);
        //System.out.println( b);
        temp = a + b;
        System.out.print(" "+temp);
        while(i<=n-3){
            System.out.print(" "+temp);
        a = b;
        b = temp;
        temp = a+b;
        i++;
        
        }
        sc.close();
    }
    
}
