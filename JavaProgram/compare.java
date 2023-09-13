import java.util.*;
public class compare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        System.out.print("a= ");
        int a = sc.nextInt();
        System.out.print("b= ");
        int b = sc.nextInt();
        if (a==b){
            System.out.println("Equal");
        } else {
            if(a>b){
                System.out.println("a is grater");
            } else {
                System.out.println("a is lesser");
            }
        }
        sc.close();
    }
}

