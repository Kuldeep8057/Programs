import java.util.Scanner;
public class A19 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the first number
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        // Input the second number
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Compute the product using repeated addition
        int product = 0;
        for (int i = 1; i <= num2; i++) {
            product += num1;
        }

        // Print the result
        System.out.println("The product of " + num1 + " and " + num2 + " is " + product);

        sc.close();
    }
}



