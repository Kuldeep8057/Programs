import java.util.Scanner;

public class S2Insertion {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[]={7,8,3,2,1};
        System.out.println("enter of size of sort number ");
        int n = sc.nextInt();
        int arr[]= new int[n];
        System.out.println("Input numbers of integers to sort ");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        //Insertion Sort
        for(int i=0; i<arr.length; i++){
            int current =arr[i];
            int j=i-1;
            while(j >=0 && current < arr[j]){
                arr[j+1] = arr[j];
                j--;
            }
            //Placement
            arr[j+1] =current;
        }
        System.out.println("Sorted list of numbers");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        //printArray(arr);
        sc.close();
    }
    
}
