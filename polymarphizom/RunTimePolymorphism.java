package polymarphizom;

class RunTimePolyA {
    void print() {
        System.out.println("This the method 01");
    }
}

public class RunTimePolymorphism extends RunTimePolyA {
    void print() {
        System.out.println("This is the method 02");
    }

    public static void main(String args[]) {
        RunTimePolyA OB = new RunTimePolymorphism();
        OB.print();
    }
}
