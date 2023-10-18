package exception_handling.exception_specification;

class Type1 extends Exception {
    Type1(String msg) {
        super(msg);
    }
}

class Type2 extends Exception {
    Type2(String msg) {
        super(msg);
    }
}

class Type3 extends Exception {
    Type3(String msg) {
        super(msg);
    }
}

public class Exercise03 {
    static void f(int x) throws Type1, Type2, Type3 {
        if (x < 0)
            throw new Type1("x <= 0");
        if (x > 0)
            throw new Type2("x >= 1");
        if (x == 0)
            throw new Type3("x == 0");

    }

    public static void main(String args[]) {
        try {
            f(0);
            f(1);
            f(-1);
        } catch (Exception e) {
            System.out.println("Caught Exceptions.....");
            e.printStackTrace(System.out);
        }
    }
}
