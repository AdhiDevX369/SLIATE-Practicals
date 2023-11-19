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

public class CommonElements {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {3, 4, 5, 6, 7};
        System.out.println("Common elements between two arrays:");

        for (int num1 : arr1) {
            for (int num2 : arr2) {
                if (num1 == num2) {
                    System.out.print(num1 + " ");
                    break;
                }
            }
        }
    }
}
