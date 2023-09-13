import java.util.Scanner;
public class S3MergeSort {
    //nlogn
public static void conquer(int arr[], int si,int mid, int ei) {
    int merged[] = new int[ei-si+1];
    int idex1 = si;
    int idex2 = mid+1;
    int x = 0;
    //0(n)
    while(idex1 <= mid && idex2 <= ei){
        if(arr[idex1] <= arr[idex2]){
            merged[x++] = arr[idex1++];
        } else {
            merged[x++] = arr[idex2++];
        }
    }
    while(idex1 <= mid ){
        merged[x++]= arr[idex1++];
    }
    while(idex2 <= ei){
        merged[x++] = arr[idex2++];
    }
    for( int i=0, j=si; i<merged.length; i++,j++){
        arr[j]=merged[i];
    }
}
    public static void divide(int arr[],int si, int ei) {
        if(si >= ei){
            return;
        }
        //0logn
        int mid =si+(ei-si)/2;
        divide(arr,si,mid);
        divide(arr,mid+1,ei);
        conquer(arr,si,mid,ei);    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int arr[]={6,3,9,5,2,8};
        System.out.println("enter of size of sort number ");
        int m = sc.nextInt();
        int arr[]= new int[m];
        System.out.println("Input numbers of integers to sort ");
        for(int i=0; i<m; i++){
            arr[i] = sc.nextInt();
        }
        int n = arr.length;
        divide(arr,0,n-1);
        
        //print
        System.out.println("Sorted list of numbers");

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
    
}
