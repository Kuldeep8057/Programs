import java.util.Scanner;

public class A20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter dividend: ");
        int dividend = sc.nextInt();
        System.out.print("Enter divisor: ");
        int divisor = sc.nextInt();

        int quotient = (dividend / divisor);
        int remainder = dividend - (quotient * divisor);

        System.out.println("The remainder is " + remainder);
        sc.close();
    }
    
}
