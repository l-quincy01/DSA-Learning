//Custom singly linked list

import java.util.*;

//Node Class
class Node {

    int data;
    Node next;

    //Constructor to intialize new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedListAdvanced {

    //Function to create a linked list of a specified length
    public static Node createLinkedList(int length) {
        Node head = new Node(0);
        Node current = head;
        for (int i = 2; i < length; i++) {
            currrent.next = new Node(i);
            current = current.next;
        }

        return current;
    }

    // Main method
    public static void main(String[] args) {

        Node head = new Node(0);
        head.next = new Node(1);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);

        //Traverse the linked list
        Node node = head;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }

    }
}
