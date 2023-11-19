/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int valueToInsert = 6;
        int[] newArr = Arrays.copyOf(arr, arr.length + 1);
        newArr[arr.length] = valueToInsert;

        System.out.println("Original Array: " + Arrays.toString(newArr));

        System.out.println("Array in Reverse Order:");
        for (int i = newArr.length - 1; i >= 0; i--) {
            System.out.print(newArr[i] + " ");
        }
    }
}
