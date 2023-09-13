import java.util.*;
public class A17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rev=0,rem;
        int n;
        
        System.out.println("enter the any no");
        n=sc.nextInt();
        
        while(n>0){
            rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }
            System.out.println("reverse number is " +" "+ rev);
        
        sc.close();
    }
    
}

    

