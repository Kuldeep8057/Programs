public class A23 {
    public static void main(String[] args) {
        
                int arr[] = { 12, 7, 25, 6,32,29,11,3 };
                int min = arr[0];
        
                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] < min)
                        min = arr[i];
                }
        
                System.out.println("Maximum Element of Array is: " + min );
            
            }
        }

