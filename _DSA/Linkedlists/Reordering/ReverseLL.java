package _DSA.Linkedlists.Reordering;

public class ReverseLL {

    // A Class of a custom Integer Linked list
    static class Node {

        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    // Method that reverse the custom linkedlist
    public static Node reverseLinkedList(Node linked_list) {

        //pointers
        Node nextNode = null;
        Node prevNode = null;
        Node current = linked_list;

        while (current != null) {

            //set nextnNode pointer to current.next(linkedlist pointer to the next node in the linked list)
            nextNode = current.next;// temp store of next before current.next is set to prevNode pointer 

            current.next = prevNode; // set current.next to prevNode pointer

            prevNode = current;     // set the prevNode pointer to current node

            current = nextNode;     // set the current node in the linkedlist to  nextnNode pointer 

        }

        return prevNode;

    }

}
