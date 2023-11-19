/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Adithya
 */
import java.util.Stack;

/**
 * This class demonstrates various operations on a Stack.
 */
public class StackOperations {

    public static void main(String[] args) {
        // Creating a Stack
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(5);
        stack.push(10);
        stack.push(3);

        // Peeking at the top element of the stack
        int topElement = stack.peek();
        System.out.println("Top element of the stack: " + topElement);

        // Popping elements from the stack
        int poppedElement = stack.pop();
        System.out.println("Popped element: " + poppedElement);

        // Checking if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);
    }
}
