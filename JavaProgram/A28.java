import java.util.Scanner;

public class A28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row size:");
        int m = sc.nextInt();
        System.out.println("Enter the column size:");
        int n= sc.nextInt();
        int matrix[][]=new int[m][n];
        if(m!=n){
            System.out.println("Matrix is not print");
            
        }
        System.out.println("Enter the element of the Matrix");
        for(int i=0; i<m;i++){
            for(int j=0;j<n;j++){
                System.out.printf("matrix[%d][%d]= ",i,j);
                matrix[i][j]= sc.nextInt();
                
            }
        }
        System.out.println("The matrix is:");
        for(int i=0; i<m;i++){
            for(int j=0;j<=i;j++){
                // if (i >= j) {
                //     System.out.print(matrix[i][j] + " ");
                // } else {
                //     System.out.print("  "); // placeholder for non-boundary element
                // }
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
    
}

