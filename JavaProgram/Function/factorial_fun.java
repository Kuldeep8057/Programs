import java.util.*;
public class factorial_fun {
    public static void printFactorial(int n) {
        int factorial = 1;
        for(int i=n; i>=1; i--){
            factorial=factorial * i;
        }
        System.out.println(factorial);
        return;
    }
public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of factorial");
        int n =sc.nextInt();
        printFactorial(n);
        sc.close();
    }
}
