package exception_handling.basic_exception;

public class Excesice02 {
    public static void main(String args[]) {
        Object OB1 = null;
        try {
            OB1.getClass();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
