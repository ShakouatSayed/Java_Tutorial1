package polymarphizom;

abstract class A {
    abstract void show();
}

class B extends A {
    void show() {
        System.out.println("This is the Abstrac Example.");
    }

}

public class ExampleAbstrac1 {
    public static void main(String args[]) {
        B o = new B();
        o.show();
    }
}
