package PracticalSheets03;

// Java Program to Add elements to An ArrayList
// Importing all utility classes
import java.util.*;
// Main class
class Que02 {
    // Main driver method
    public static void main(String args[])
    {

        // Creating an Array of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // Custom inputs
        al.add("Geeks");
        al.add("Geeks");


        // Here we are mentioning the index
        // at which it is to be added
        al.add(1, "test");

        // Printing all the elements in an ArrayList
        System.out.println(al);
    }
}