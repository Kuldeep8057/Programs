import java.util.*;

public class S1BubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[] = { 7,8,3,2,1};
        System.out.println("enter of size of sort number ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Input numbers of integers to sort ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        
        //bubble sort
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted list of numbers");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //printArray(arr);
        sc.close();
    }
    
}
