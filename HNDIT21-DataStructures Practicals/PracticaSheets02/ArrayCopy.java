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

public class ArrayCopy {

    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] newArray = Arrays.copyOf(originalArray, originalArray.length);
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}
