package exception_handling.exception_specification;

class Exception02 extends Exception {
    private String s1 = "Hossen";
    int num = 10;

    public Exception02(String msg) {
        super(msg);
        System.out.println("This the message of Exceptions: " + s1);
        this.s1 = s1;
    };

    protected void show() {
        System.out.println(num + " : " + s1);
        System.out.println("this message is show method message....!");
    }
}

class Test02 {
    public void method01() throws Exception02 {
        System.out.println("this is the exception message..");
        throw new Exception02("Exception one message..!");
    }
}

public class Practice01 {
    public static void main(String args[]) {
        try {
            Test01 OB2 = new Test01();
            OB2.method1();
        } catch (Exception01 e) {
            System.err.println("caught Exceptions: ");
            e.printStackTrace();
            e.show();

        }
    }
}
