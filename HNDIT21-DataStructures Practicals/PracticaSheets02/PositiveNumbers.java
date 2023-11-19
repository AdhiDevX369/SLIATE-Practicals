/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class PositiveNumbers {

    public static void main(String[] args) {
        int[] arr = {-3, -2, -1, 0, 1, 2, 3};
        System.out.println("Positive numbers in the array:");
        for (int num : arr) {
            if (num > 0) {
                System.out.print(num + " ");
            }
        }
    }
}
