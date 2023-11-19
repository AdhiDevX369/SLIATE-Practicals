/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Queue;

/**
 *
 * @author Adithya
 */
import java.util.Scanner;

public class ArrayQueue {

    private int size;
    private int front, rear;
    private int[] queue;

    // Constructor to initialize the queue size and array
    public ArrayQueue(int size, int[] arr) {
        this.size = size;
        this.queue = arr;
        front = -1; // Initialize front and rear to -1 indicating an empty queue
        rear = -1;
    }

    // Method to get the queue size
    public int getSize() {
        return size;
    }

    // Method to get the queue values
    public int[] getQueue() {
        return queue;
    }

    // Method to insert (enqueue) a value into the queue
    public void insert(int n) {
        if (isFull()) {
            System.out.println("Queue is Full");
        } else {
            front++;
            queue[front] = n;
        }
    }

    // Method to delete (dequeue) the first value from the queue
    public void delete() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            rear++;
            System.out.println("Queue first value Deleted: " + queue[rear]);
            queue[rear] = 0;
        }
    }

    // Method to display the queue values
    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty...");
        } else {
            System.out.print("Queue contents: ");
            for (int j = rear + 1; j <= front; j++) {
                System.out.print(queue[j] + ", ");
            }
            System.out.println();
        }
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return front >= size - 1;
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return front == rear;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Queue Size");
        int arraySize = sc.nextInt();
        int array[] = new int[arraySize];
        ArrayQueue queue = new ArrayQueue(arraySize, array);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Choose Your Option:\n "
                    + "1--> Add Value in Queue\n"
                    + "2--> Delete Value in Queue\n "
                    + "3--> Display Value in Queue\n "
                    + "4--> End Program\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Value to Add to Queue:");
                    int value = sc.nextInt();
                    queue.insert(value);
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                case 4:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}
