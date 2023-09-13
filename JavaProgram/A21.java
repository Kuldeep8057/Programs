public class A21 {
        public static void main(String[] args) {
            int[] numArray = {1, 4, 7, 8, 10, 13, 14};
            System.out.print("Array with only even numbers: ");
            for (int i=0; i<numArray.length; i++) {
                if (numArray[i] % 2 == 0) {
                    System.out.print(numArray[i] + " ");
                }
            }
        }
    }
    

