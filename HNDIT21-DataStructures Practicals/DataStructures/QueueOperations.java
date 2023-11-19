/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DataStructures;

/**
 *
 * @author Adithya
 */
import java.util.LinkedList;
import java.util.Queue;

/**
 * This class demonstrates various operations on a Queue.
 */
public class QueueOperations {

    public static void main(String[] args) {
        // Creating a Queue using LinkedList
        Queue<Integer> queue = new LinkedList<>();

        // Adding elements to the queue
        queue.add(5);
        queue.add(10);
        queue.add(3);

        // Peeking at the front element of the queue
        int frontElement = queue.peek();
        System.out.println("Front element of the queue: " + frontElement);

        // Removing elements from the queue
        int removedElement = queue.remove();
        System.out.println("Removed element: " + removedElement);

        // Checking if the queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);
    }
}
