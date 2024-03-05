package generics.Simple_generics.A_tuple_library;

class TwoTuple<A, B>{
    public final A first;
    public final B second;
    public TwoTuple(A a, B b){this.first = a; this.second = b;}
    public String toString(){
        return first + ", " + second;
    }
}

class ThreeTuple<A, B, C> extends TwoTuple<A, B>{
    public final C third;
    public ThreeTuple(A a, B b, C c) {
        super(a, b);
        third = c;
    }
    public String toString(){
        return first + ", " + second + ", " + third;
    }
}

class FourTuple<A, B, C, D> extends ThreeTuple<A, B, C>{
    public final D four;
    public FourTuple(A a, B b, C c, D d) {
        super(a, b, c);
        four = d;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", "+ four;
    }
}

class FiveTuple<A, B, C, D, E > extends FourTuple<A, B, C, D>{
    public final E five;
    public FiveTuple(A a, B b, C c, D d, E e) {
        super(a, b, c, d);
        five = e;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", "+ four + ", " + five;
    }
}

class Amphibian {}
class Vehicle {}

public class Example01 {
    static TwoTuple<String, Integer> f(){
        //outboxing convert int to integer.
        return new TwoTuple<String, Integer>("Hi, This is TwoTuple type class."  , 47);
    }
    static ThreeTuple<Amphibian, String, Integer> g(){
        return new ThreeTuple<Amphibian, String, Integer>(new Amphibian(),"Hi, This is ThreeTuple type class."  , 48);
    }
    static FourTuple<Vehicle, Amphibian, String, Integer> i(){
        return new FourTuple<Vehicle, Amphibian, String, Integer>(new Vehicle(),new Amphibian(),"Hi, This is FourTuple type class."  , 49);
    }
    static FiveTuple<Vehicle, Amphibian, String, Integer, Double> j(){
        return new FiveTuple<Vehicle, Amphibian, String, Integer, Double>(new Vehicle(),new Amphibian(),"Hi, This is FiveTuple type class."  , 50, 3.1416);
    }

    public static void main(String[] args) {
        TwoTuple<String, Integer> tT = f();
        System.out.println(tT);
        System.out.println(g());
        System.out.println(i());
        System.out.println(j());
    }
}
