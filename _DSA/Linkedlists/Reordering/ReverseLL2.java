package _DSA.Linkedlists.Reordering;

public class ReverseLL2 {

    static class ListNode {

        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode reverseList(ListNode head) {

        ListNode p = null;
        ListNode n = null;
        ListNode curr = head;

        while (curr != null) {
            n = curr.next; // intially setting (next pointer) to the next node in the linked list

            curr.next = p; // severing the curr.next linkedlist pointer and making it point the (previous pointer)

//stepping previous to current and current to next 
            p = curr; // setting the (previous pointer) to the curr linkedlist node

            curr = n; //  setting the (next pointer) to the next node in the linked list
        }

        return p;

    }

}


/*
 
// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Main {
    
    public int getSum(HashMap<String, Integer> map){
        int dist = 0;
        
        for (var entry : map.entrySet()) {
            
            dist = dist + entry.getValue());
        }

        return dist
        
    }
    
    public int getDist(Block){
        
        for
        
    }
     
    
    public static void main(String[] args) {
        
    }
}


 */
