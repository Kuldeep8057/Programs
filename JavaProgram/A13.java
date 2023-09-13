import java.util.Scanner;

public class A13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,rem=0,no;
        int n;
        System.out.println("enter the any no");
        n=sc.nextInt();
        no = n;
        while(n>0){
            rem=n%10;
            rev =rev*10+rem;
            n=n/10;
        }
        if(no==rev){
            System.out.println("Palindrom");
        }
        else{
            System.out.println("not Palindrom");
        }
        sc.close();
    }
    
}
