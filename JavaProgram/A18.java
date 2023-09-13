import java.util.Scanner;

public class A18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an alphabet: ");
        char ch = sc.next().charAt(0);

        char predecessor = (char)(ch - 1);
        char successor = (char)(ch + 1);

        System.out.println("Predecessor of " + ch + " is: " + predecessor);
        System.out.println("Successor of " + ch + " is: " + successor);

        sc.close();
    }
}

    

