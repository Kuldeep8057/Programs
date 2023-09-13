import java.util.Scanner;

public class S4SelectionSort {

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
        //Selection sort 

        for(int k=0; k<arr.length-1; k++){
            int smallest =k;
            for(int j=k+1; j<arr.length; j++){
                if(arr[smallest]>arr[j]){
                    smallest =j;
                }
            }
            int temp = arr[smallest];
            arr[smallest]=arr[k];
            arr[k]=temp;
        }
        System.out.println("Sorted list of numbers");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
        
    }
    
}
