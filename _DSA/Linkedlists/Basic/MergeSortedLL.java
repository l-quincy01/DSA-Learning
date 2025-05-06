
/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
public class MergeSortedLL {

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
//NOTE: Singly Linked Listed 

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-1); //create  a dummy node with a value of -1
        ListNode current = dummy; //create a pointer called current which points to the dummy LL of value -1

        while (list1 != null && list2 != null) {

            //compare the values in LL1 and LL2 and insert the lesser value first then move the respective LL pointer forward by one
            if (list1.val < list2.val) {
                current.next = new ListNode(list1.val);//insert LL1 value first because its lesser, 
                list1 = list1.next; //Move LL 1 by 1, to its  next node
            } else {
                current.next = new ListNode(list2.val);
                list2 = list2.next;//Move LL 2 by 1, to its next node
            }
            current = current.next; //Movecurrent pointer(mereged LL) by 1

        }

        //edge case. If any of the LL's still have values, i.e the longer one. Put its remaining nodes at the end 
        if (list1 != null) {
            current.next = list1;
        } else {
            current.next = list2;
        }

        return dummy.next; // return the dummy but point forward from its intial node of value -1 

    }

}
