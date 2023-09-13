class A{
    public void dis(){
        System.out.println("ok");
    }
}
class B extends A{
    public void dis(){
        
        System.out.println("bye");
    }
    public  void kd() {
        super.dis();
    }
}


public class Inherit {

    public static void main(String[] args) {
        B b1 = new B();
        b1.dis();
        b1.kd();

    }
}
