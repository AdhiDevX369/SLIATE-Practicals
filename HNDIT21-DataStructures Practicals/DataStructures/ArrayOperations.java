/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

import java.util.Arrays;

/**
 *
 * @author Adithya
 */
/**
 * This class demonstrates various operations on Arrays.
 */
public class ArrayOperations {

    public static void main(String[] args) {
        // Initializing an array
        int[] numbers = {5, 10, 3, 8, 1};

        // Accessing elements by index
        int elementAtIndex = numbers[2];
        System.out.println("Element at index 2: " + elementAtIndex);

        // Modifying an element at a specific index
        numbers[3] = 15;
        System.out.println("Array after modifying element at index 3: " + Arrays.toString(numbers));

        // Finding array length
        int length = numbers.length;
        System.out.println("Array length: " + length);

        // Sorting the array
        Arrays.sort(numbers);
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
