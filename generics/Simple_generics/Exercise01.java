/*
 * Thinking in Java.
 * Exercise Solution 01:
 * 
 * Exercise 1: Use Holders with the typeinfo.pets library to show that a Holders
 * that is specified to hold a base type can also hold a derived type.
 */


package generics.Simple_generics;


class Pet{}

public class Exercise01<T> {
    private T t;
    public Exercise01(T t){this.t = t;}
    public void set(T t){this.t = t;}
    public T get(){return t;}
    public static void main(String[] args) {
        Exercise01<AutoMobile> ex = new Exercise01<AutoMobile>(new AutoMobile() {
            //AutoMobile a = ex.get();
            // System.out.println(ex.get());
            // ex.set(new Dog());
            // System.out.println(ex.get());
            // ex.set(new Gabril());
            // System.out.println(ex.get());
        });
    }
}