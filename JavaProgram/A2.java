
import java.util.Scanner;

public class A2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int myNum = sc.nextInt();               // Integer (whole number)
        float myFloatNum = sc.nextFloat();    // Floating point number
        char myLetter = sc.next().charAt(0);         // Character
        boolean myBool = sc.nextBoolean();       // Boolean
        String myText = sc.nextLine();     // String
        System.out.println("The entered integer value is:" + myNum );
        System.out.println("The entered floating point value is:" + myFloatNum);
        System.out.println("The entered character is:"+ myLetter);
        System.out.println("The entered boolean value is :"+ myBool);
        System.out.println("The entered text is:"+ myText);
    sc.close();
    }
}
