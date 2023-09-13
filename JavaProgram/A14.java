import java.util.Scanner;

public class A14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0,LastDigit;
        int n;
        System.out.println("enter the any no");
        n=sc.nextInt();
        LastDigit = n%10;
        n=n/10;
        while(n>0){
            
            sum =sum+n%10;
            n=n/10;
        }
        if(LastDigit==sum){
            System.out.println("Handsome");
        }
        else{
            System.out.println("not Handsome");
        }
        sc.close();
    }
    
}
