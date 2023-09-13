public class A32Constructor {
    
    
        // Default constructor
        public A32Constructor() {
            System.out.println("Default constructor called");
        }
        
        // Parameterized constructor
        public A32Constructor(int num) {
            System.out.println("Parameterized constructor called with num = " + num);
        }
        
        // Copy constructor
        public A32Constructor(A32Constructor other) {
            System.out.println("Copy constructor called");
        }
        
        public static void main(String[] args) {
            
            // Create objects using different constructors
            A32Constructor obj1 = new A32Constructor();  // Default constructor
            A32Constructor obj2 = new A32Constructor(42);  // Parameterized constructor
            A32Constructor obj3 = new A32Constructor(obj1);  // Copy constructor
        }
    }
    

