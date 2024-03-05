
/* Exercise 3 : (1) Create and test a SixTuple generic. */

package generics.Simple_generics.A_tuple_library;


class TwoTupleA<A, B>{
    public final A first;
    public final B second;
    public TwoTupleA(A a, B b){
        this.first = a;
        this.second = b;
    }
    public String toString(){
        return first + ", " + second;
    }
}
class ThreeTupleA<A, B, C> extends TwoTupleA<A, B>{
    public final C third;
    public ThreeTupleA(A a, B b, C c){
        super(a, b);
        third = c;
    }
    public String toString(){
        return first + ", " + second + ", " + third;
    }
}
class FourTupleA<A, B, C, D> extends ThreeTupleA<A, B, C>{
    public final D fourth;
    public FourTupleA(A a, B b, C c, D d){
        super(a, b, c);
        fourth = d;
    }
    public String toString(){
        return first + ", " + second + ", " + third + ", " + fourth;
    }
}
class FiveTupleA<A, B, C, D, E> extends FourTupleA<A, B, C, D>{
    public final E fifth;
    public FiveTupleA(A a, B b, C c, D d, E e){
        super(a, b, c, d);
        fifth = e;
    }
    public String toString(){
        return first + ", " + second+ ", " + third + ", " + fourth+ ", " + fifth ;
    }
}

class SixTupleA<A, B, C, D, E, F> extends FiveTupleA<A, B, C, D, E>{
    public final F sixth;
    public SixTupleA(A a, B b, C c, D d, E e, F f){
        super(a, b, c, d, e);
        sixth = f;
    }
    public String toString(){
        return first + ", " + second+ ", " + third + ", " + fourth+ ", " + fifth + ", " + sixth;
    }
}

class AmpbihienA{}
class VehicleA{}

public class Exercise03 {
    static TwoTupleA<String, Integer> f(){
        return new TwoTupleA<String, Integer>("Hi ", 48);
    }
    static ThreeTupleA<AmpbihienA,String, Integer> g(){
        return new ThreeTupleA<AmpbihienA, String, Integer>(new AmpbihienA(),"Hi ", 49);
    }
    static FourTupleA<VehicleA, AmpbihienA,String, Integer> h(){
        return new FourTupleA<VehicleA, AmpbihienA, String, Integer>(new VehicleA(),new AmpbihienA(),"Hi ", 50);
    }
    static FiveTupleA<VehicleA, AmpbihienA,String, Integer, Double> i(){
        return new FiveTupleA<VehicleA, AmpbihienA, String, Integer, Double>(new VehicleA(),new AmpbihienA(),"Hi ", 50, 3.1416);
    }
    static SixTupleA<VehicleA, AmpbihienA,String, Integer, Double, Character> j(){
        return new SixTupleA<VehicleA, AmpbihienA, String, Integer, Double, Character>(new VehicleA(),new AmpbihienA(),"Hi ", 50, 3.1416, 'S');
    }
    public static void main(String[] args) {
        TwoTupleA<String, Integer> tTA = f();
        System.out.println(tTA);
        System.out.println(g());
        System.out.println(h());
        System.out.println(i());
        System.out.println(j());
    }
}
