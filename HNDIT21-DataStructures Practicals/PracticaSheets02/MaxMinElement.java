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

public class MaxMinElement {

    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 9, 1, 5};
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        System.out.println("Minimum Element: " + min);
        System.out.println("Maximum Element: " + max);
    }
}
