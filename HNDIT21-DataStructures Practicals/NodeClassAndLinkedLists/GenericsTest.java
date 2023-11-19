/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodeClassAndLinkedLists;

/**
 *
 * @author Adithya
 */
import java.util.ArrayList; // Importing ArrayList class

// Creating a GenericsTest class
public class GenericsTest {

    // Main method
    public static void main(String chinthaka[]) {

        // Creating an instance of ArrayList to simulate a list (as List<> cannot be directly instantiated)
        ArrayList<Integer> inlist = new ArrayList<>();

        // Displaying the size of the list
        System.out.printf("size of the list: %d%n", inlist.size());

        // Displaying if the list is empty or not
        System.out.printf("list is empty: %s%n", inlist.isEmpty());

        // Inserting 5 at the front of the list
        System.out.println("insert front 5 in the list");
        inlist.add(0, 5); // Adding at index 0 (front) because there's no direct method like addFront

        // Displaying the size of the list after insertion
        System.out.printf("size of the list: %d%n", inlist.size());

        // Displaying the list after insertion
        System.out.println("list now");
        for (int value : inlist) {
            System.out.print(value + " ");
        }
        System.out.println();

        // Inserting 10 at the front of the list
        System.out.println("insert front 10 in the list");
        inlist.add(0, 10); // Adding at index 0 (front)

        // Displaying the size of the list after insertion
        System.out.printf("size of the list: %d%n", inlist.size());

        // Displaying the list after insertion
        System.out.println("list now");
        for (int value : inlist) {
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
