/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodeClassAndLinkedLists;

/**
 *
 * @author Adithya
 */
public class LinkedListOperations {

    Node head;

    // Constructor to initialize an empty linked list
    LinkedListOperations() {
        head = null;
    }

    // Method to insert a node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to insert a node at the end of the linked list
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Method to display the linked list
    public void displayList() {
        Node current = head;
        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    // Method to delete a node with a given value from the linked list
    public void deleteNode(int key) {
        Node temp = head;
        Node prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            return;
        }

        prev.next = temp.next;
    }

    public static void main(String[] args) {
        LinkedListOperations linkedList = new LinkedListOperations();

        linkedList.insertAtEnd(5);
        linkedList.insertAtEnd(10);
        linkedList.insertAtEnd(15);
        linkedList.displayList();

        linkedList.insertAtBeginning(2);
        linkedList.displayList();

        linkedList.deleteNode(10);
        linkedList.displayList();
    }
}
