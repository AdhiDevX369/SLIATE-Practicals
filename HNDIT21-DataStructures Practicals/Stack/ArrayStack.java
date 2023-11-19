package Stack;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Adithya
 */
import java.util.Scanner;

public class ArrayStack {

    private int size;
    private int top;
    private int[] stk;

    // Constructor to initialize the stack size and array
    public ArrayStack(int size, int[] arr) {
        this.size = size; // Set the stack size
        this.stk = arr; // Define the stack as a static array
        top = -1; // Set top to -1 to indicate an empty stack
    }

    // Method to get the stack size
    public int getSize() {
        return size;
    }

    // Method to get the stack values
    public int[] getStk() {
        return stk;
    }

    // Method to push (insert) a value onto the stack
    public void push(int n) {
        if (isFull()) {
            System.out.println("Stack is Full");
        } else {
            top++;
            stk[top] = n;
        }
    }

    // Method to pop (remove) the top element from the stack
    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack is Empty...");
        } else {
            System.out.println("Stack top value Deleted " + stk[top]);
            stk[top] = 0;
            top--;
        }
    }

    // Method to display the stack values
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is Empty...");
        } else {
            System.out.print("Stack contents: ");
            for (int j = 0; j <= top; j++) {
                System.out.print(stk[j] + ", ");
            }
            System.out.println();
        }
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top >= size - 1;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top <= -1;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Stack Size");
        int stackSize = sc.nextInt();
        int stackArray[] = new int[stackSize];
        ArrayStack stack = new ArrayStack(stackSize, stackArray);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Choose Your Option:\n "
                    + "1--> Add Value in Stack\n"
                    + "2--> Delete Value in Stack\n "
                    + "3--> Display Value in Stack\n "
                    + "4--> End Program\n");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Value to Add to Stack:");
                    int value = sc.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    stack.display();
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
