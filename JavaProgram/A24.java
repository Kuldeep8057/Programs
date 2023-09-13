import java.util.Arrays;
import java.util.Scanner;

public class A24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Prompt the user for number of elements to sort
        System.out.print("Enter the number of elements to sort: ");
        int numElements = sc.nextInt();

        // Create an integer array to hold the input elements
        int[] arr = new int[numElements];

        // Prompt the user to input each element
        for (int i = 0; i < numElements; i++) {
            System.out.printf("Enter element [%d]: ", i );
            arr[i] = sc.nextInt();
        }

        // Sort the elements in ascending order
        Arrays.sort(arr);

        // Print the sorted elements
        System.out.println("Sorted elements:");
        for (int element : arr) {
            System.out.println(element);
        }

        sc.close();
    }
}    

