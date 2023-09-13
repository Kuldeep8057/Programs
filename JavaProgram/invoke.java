

class Animal {
    void eat(){
        System.out.println("eating...");
    }
}
class Dog extends Animal {
    void eat () {
        System.out.println("eating bread..");
        System.out.println("barking..");
        super.eat();
    }
}
public class invoke {
    public static void main(String[] args) {
        Dog D1 = new Dog();
        D1.eat();
    }
    
}
