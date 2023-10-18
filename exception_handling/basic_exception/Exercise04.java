package exception_handling.basic_exception;

class TestException01 extends Exception {
    public TestException01() {
    };

    public TestException01(String msg) {
        super(msg);
    }
}

public class Exercise04 extends TestException01 {
    public void method1() throws TestException01 {
        String s1 = "Sayed";
        System.out.println(s1);
        throw new TestException01("Return the some String of Exception message...!");
    }

    public static void main(String args[]) {
        Exercise04 OB3 = new Exercise04();
        try {
            OB3.method1();
        } catch (TestException01 e) {
            e.printStackTrace();
        }
    }
}
