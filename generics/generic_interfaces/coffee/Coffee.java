package generics.generic_interfaces.coffee;

public class Coffee {
    private static long count = 0;
    private final long id = count++;
    public String toString(){
        return getClass().getSimpleName()+" "+id;
    }
}
