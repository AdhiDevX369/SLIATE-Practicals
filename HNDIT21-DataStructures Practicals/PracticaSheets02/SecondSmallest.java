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

public class SecondSmallest {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 9, 1, 5};
        Arrays.sort(arr);
        System.out.println("Second smallest element: " + arr[1]);
    }
}
