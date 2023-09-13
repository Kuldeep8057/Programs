import java.util.Scanner;

public class A22 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
            int arr[] = { 5, 12, 7, 25, 6,32,29,11 };
            int max = arr[0];
    
            for (int i = 1; i < arr.length; i++) {
                if (arr[i] > max)
                    max = arr[i];
            }
    
            System.out.println("Maximum Element of Array is: " + max);
            sc.close();
        }
    }

