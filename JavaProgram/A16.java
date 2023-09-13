import java.util.Scanner;

public class A16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,counter=0;
        int i=2;
        System.out.println("Enter any number");
        n = sc.nextInt();
        while(i<=n/2){
            if(n%i==0){
                counter=1;
                break;
            }
            i++;
        }
        if(counter==0){
            System.out.println(  n +" is  prime number");
        }
        else{
            System.out.println(  n +" is not prime number");
        }
        sc.close();
    }
    
}
