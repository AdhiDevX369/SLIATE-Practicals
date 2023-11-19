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
import java.util.Collections;

public class DescendingOrder {
    public static void main(String[] args) {
        Integer[] arr = {64, 25, 12, 22, 11};
        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Array in Descending Order: " + Arrays.toString(arr));
    }
}
