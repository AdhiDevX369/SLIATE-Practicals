/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Adithya
 */
import java.util.ArrayList;
import java.util.Collections;

/**
 * This class demonstrates various operations on ArrayList.
 */
public class ArrayListOperations {

    public static void main(String[] args) {
        // Creating an ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements to the ArrayList
        numbers.add(5);
        numbers.add(10);
        numbers.add(3);
        numbers.add(8);
        numbers.add(1);

        // Displaying the original ArrayList
        System.out.println("Original ArrayList: " + numbers);

        // Adding an element at a specific index
        numbers.add(2, 15);
        System.out.println("ArrayList after adding 15 at index 2: " + numbers);

        // Removing an element at a specific index
        numbers.remove(3);
        System.out.println("ArrayList after removing element at index 3: " + numbers);

        // Retrieving an element at a specific index
        int elementAtIndex = numbers.get(4);
        System.out.println("Element at index 4: " + elementAtIndex);

        // Checking if an element exists in the ArrayList
        boolean containsElement = numbers.contains(8);
        System.out.println("ArrayList contains 8: " + containsElement);

        // Finding the index of a specific element
        int index = numbers.indexOf(10);
        System.out.println("Index of 10: " + index);

        // Sorting the ArrayList
        Collections.sort(numbers);
        System.out.println("Sorted ArrayList: " + numbers);

        // Reversing the ArrayList
        Collections.reverse(numbers);
        System.out.println("Reversed ArrayList: " + numbers);

        // Clearing all elements from the ArrayList
        numbers.clear();
        System.out.println("ArrayList after clearing all elements: " + numbers);
    }
}
