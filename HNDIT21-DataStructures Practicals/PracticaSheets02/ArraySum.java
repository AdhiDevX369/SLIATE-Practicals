/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class ArraySum {
    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10};
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        System.out.println("Sum of Array elements: " + sum);
    }
}
