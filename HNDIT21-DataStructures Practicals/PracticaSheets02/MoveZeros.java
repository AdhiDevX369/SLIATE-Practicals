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

public class MoveZeros {

    public static void main(String[] args) {
        int[] arr = {0, 3, 0, 5, 7, 0, 8, 0, 9};
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[count++] = arr[i];
            }
        }

        while (count < arr.length) {
            arr[count++] = 0;
        }

        System.out.println("Array after moving zeros to the end: " + Arrays.toString(arr));
    }
}
