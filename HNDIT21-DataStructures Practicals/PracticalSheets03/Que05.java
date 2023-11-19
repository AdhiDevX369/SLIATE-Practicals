package PracticalSheets03;

import java.util.*;
// Main class
class Que05 {
    // Main driver method
    public static void main(String args[])
    {
        // Creating an Arraylist of string type
        ArrayList<String> al = new ArrayList<>();

        // Adding elements to ArrayList
        // using standard add() method
        al.add("Geeks");
        al.add("Geeks");
        al.add(1, "For");

        // Using the Get method and the
        // for loop
        for (int i = 0; i < al.size(); i++)
        {
            System.out.print(al.get(i) + " ");
        }

        System.out.println();
        // Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}