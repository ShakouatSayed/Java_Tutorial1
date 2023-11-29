/*
 * Thinking in Java.
 * Exercise Solution 12.
 * 
 * Exercise 12: (3) Use TypeCounter with the CoffeeGenerator.java class in the
 * Generics
 * chapter.
 */

package type_information.pets.Using_class_literals;

import generics.generic_interfaces.CoffeeGenerator;
import generics.generic_interfaces.coffee.Coffee;

// class Coffees {
//     public static final CoffeeGenerator cg = new types();
// }

public class Exercise12 {
    public static void main(String args[]){
        CountingRecursively cr = new CountingRecursively(Coffee.class);
        for(Coffee coffee: new CoffeeGenerator(5)){
            System.out.println(coffee.getClass().getSimpleName());
            cr.count(coffee);
        }
        System.out.println(" ");
        System.out.println(cr);
    }
    
}
