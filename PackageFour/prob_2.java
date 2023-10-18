package PackageFour;
class circle {
    double radious = 0;
    public circle (){
         radious = 0.1;   
}
   public circle (double d){
       radious  = d;
   }
   public double getArea(){
       return 2 * 3.1415 * radious;
   }
}

public class prob_2 {
public static void main(String args[]){
    circle c = new circle();
    System.out.println(c.getArea()+.6d);
    String s = new String("ch");
    System.out.println(s);
}
}
    