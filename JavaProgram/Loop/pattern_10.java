public class pattern_10 {
    public static void main(String args[]){
        int n = 4;
        //upeer half
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                
        System.out.println();    
        }
        //lower half
        for(int i=n; i>=1; i--){
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            //space
            for(int j=1; j<=2*(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
                
        System.out.println();    
        }
    }
}