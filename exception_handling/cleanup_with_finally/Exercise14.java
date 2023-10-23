/*
 Thinking in Java.
 Exercise Solution 14: 

 Exercise 14: Show that OnOffSwitch.java can fail by throwing a
 RuntimeException inside the try block. 
 
 */

class OnException extends Exception {
};

class OffException extends Exception {
};

class Switch {
    boolean state = false;

    public boolean read() {
        return state;
    }

    public void on() {
        state = true;
        System.out.println("True");
    }

    public void off() {
        state = false;
        System.out.println("False");
    }

    public String toString() {
        return state == true ? "On" : "Off";
    }
}

public class Exercise14 {

    private static Integer x[] = new Integer[1];
    private static Switch swc = new Switch();

    public static void f(int x) throws OnException, OffException {
    };

    public static void main(String args[]) {
        try {
            swc.on();
            f(x[0]);
            Exercise14.f(1);
        } catch (OnException e) {
            System.out.println("Caught Execption.");
        } catch (OffException e) {
            System.out.println("Caught Execption.");
        } finally {
            swc.off();
        }
    }

}
