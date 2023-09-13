import java.util.Scanner;

public class A12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arm=0,rem,no;
        int n;
        System.out.println("enter the any no");
        n=sc.nextInt();
        no = n;
        while(n>0){
            rem=n%10;
            arm=arm+rem*rem*rem;
            n=n/10;
        }
        if(no==arm){
            System.out.println("armstrong");
        }
        else{
            System.out.println("not armstrong");
        }
        sc.close();
    }
    
}
