class A {
    int x =5 ;
    
}
class B extends A{
    int x =10;
    
    void printval () {
        System.out.println(" x = " + x);
        System.out.println(" x = "+ super.x);
    }
}

public class Inherit1 {
    public static void main(String[] args) {
        B b1 =new B ();
        b1.printval();
    }
    
}
