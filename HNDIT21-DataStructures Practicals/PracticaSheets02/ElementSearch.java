/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticaSheets02;

/**
 *
 * @author Adithya
 */
public class ElementSearch {

    public static void main(String[] args) {
        int[] arr = {4, 6, 7, 2, 9, 1, 5};
        int searchElement = 7;
        boolean found = false;

        for (int num : arr) {
            if (num == searchElement) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Element " + searchElement + " found in the array.");
        } else {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
