// /*
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
//  * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
//  */

// /**
//  *
//  * @author SHAKOUAT HOSSEN
//  */
// // Java Program to Demonstrate Working of
// // Comparator Interface
// // Importing required classes
// import java.lang.*;
// import java.util.*;

// // Class 1
// // A class to represent a Student
// class Student {

//     // Attributes of a student
//     int rollno;
//     String name, address;

//     // Constructor
//     public Student(int rollno, String name, String address) {

//         // This keyword refers to current instance itself
//         this.rollno = rollno;
//         this.name = name;
//         this.address = address;
//     }

//     // Method of Student class
//     // To print student details in main()
//     public String toString() {

//         // Returning attributes of Student
//         return this.rollno + " " + this.name + " "
//                 + this.address;
//     }
// }

// // Class 2
// // Helper class implementing Comparator interface
// class Sortbyroll implements Comparator<Student> {

//     // Method
//     // Sorting in ascending order of roll number
//     public int compare(Student a, Student b) {

//         return a.rollno - b.rollno;
//     }
// }

// // Class 3
// // Helper class implementing Comparator interface
// class Sortbyname implements Comparator<Student> {

//     // Method
//     // Sorting in ascending order of name
//     public int compare(Student a, Student b) {

//         return a.name.compareTo(b.name);
//     }
// }

// // Class 4
// // Main class
// class GFG {

//     // Main driver method
//     public static void main(String[] args) {

//         // Creating an empty ArrayList of Student type
//         ArrayList<Student> ar = new ArrayList<Student>();

//         // Adding entries in above List
//         // using add() method
//         ar.add(new Student(111, "Mayank", "london"));
//         ar.add(new Student(131, "Anshul", "nyc"));
//         ar.add(new Student(121, "Solanki", "jaipur"));
//         ar.add(new Student(101, "Aggarwal", "Hongkong"));

//         // Display message on console for better readability
//         System.out.println("Unsorted");

//         // Iterating over entries to print them
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }

//         // Sorting student entries by roll number
//         Collections.sort(ar, new Sortbyroll());

//         // Display message on console for better readability
//         System.out.println("\nSorted by rollno");

//         // Again iterating over entries to print them
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }

//         // Sorting student entries by name
//         Collections.sort(ar, new Sortbyname());

//         // Display message on console for better readability
//         System.out.println("\nSorted by name");

//         // // Again iterating over entries to print them
//         for (int i = 0; i < ar.size(); i++) {
//             System.out.println(ar.get(i));
//         }
//     }
// }

import java.lang.*;
import java.util.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
/**
 *
 * @author SHAKOUAT HOSSEN
 */
class Student {

    int roll_no;
    String name, address;

    public Student(int roll_no, String name, String address) {
        this.roll_no = roll_no;
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "Roll no: " + roll_no + "Name: " + name + "Address: " + address;
    }
}

class SortByRoll implements Comparator<Student> {

    public int sortRoll(Student a, Student b) {
        return a.roll_no - b.roll_no;
    }
}

class SortByName implements Comparator<Student> {

    public int sortName(Student a, Student b) {
        return a.name.compareTo(b.name);
    }
}

public class Test01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        ArrayList<Student> arl = new ArrayList<>();

        arl.add(new Student(10, "Sayed", "Chakaria"));
        arl.add(new Student(10, "Hossen", "Cox'sBazar"));
        arl.add(new Student(10, "Mostafa", "Chittagong"));
        arl.add(new Student(10, "Hanif", "Dhaka"));
        // TODO code application logic here

        System.out.println("Unshorted");
        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }

        System.out.println("Sorted By roll ");

        Collections.sort(arl, new SortByRoll());

        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }

        System.out.println("Sort By Name: ");
        Collections.sort(arl, new SortByName());

        for (int i = 0; i < arl.size(); i++) {
            System.out.println(arl.get(i));
        }
        // System.out.println("Sayed");

    }
}
