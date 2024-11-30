// Online Java Compiler
// Use this editor to write, compile and run your Java code online

import java.util.*;

class ArrayLstAndLinkedLst {

    public static void main(String[] args) {
        LinkedList<String> linkedLst = new LinkedList<String>();
        ArrayList<String> arrLst = new ArrayList<String>();
        /*Functions in Linked and Array list
    add(Element)
    get(int index) gets element at the specified index
    addFirst()	Adds an item to the beginning of the list	
    addLast()	Add an item to the end of the list	
    removeFirst()	Remove an item from the beginning of the list	
    removeLast()	Remove an item from the end of the list	
    getFirst()	Get the item at the beginning of the list	
    getLast()	Get the item at the end of the list
   *Doubly Linked list pointer to both previous and next element
      
       
     
       Array list: store elements/nodes sequentially in a single contgious block of memory without any gaps between the nodes
       
Advantages:
        * Fast Indexing: O(1) time complexity for accessing elements by index
        * Cache-Friendly: Contiguous memory allocation improves cache performance.
        * Low Memory Overhead: No additional memory required for pointers.

 Disadvantages:
        * Costly Resizing: O(n) time complexity for resizing when the array is full.
        * Inefficient Insertions/Deletions: O(n) time complexity for adding or removing elements at arbitrary positions (except at the end).
        * 
       

 LinkedList stores all elements/nodes in a non-contigious manner meaning they may be gaps  between elements/nodes.
 
 Advantages:
       * Efficient Insertions/Deletions: O(1) time complexity for adding or removing elements if the position is known.
       * Dynamic Size: Easily grows and shrinks without the need for resizing.
Disadvantages:
       * Slow Indexing: O(n) time complexity for accessing elements by index.
       * Higher Memory Overhead: Additional memory required for storing pointers.
       * Fragmented Storage: Nodes are scattered in memory, potentially affecting cache performance.
       * 
       * for (type variableName : arrayName) {
              // code block to be executed
              }
         */
        //Add Linked and Array List
        linkedLst.add("Ronaldinho");
        linkedLst.add("Ronaldo R9");
        linkedLst.add("Roberto Carlos");

        arrLst.add("Thierry");
        arrLst.add("Zizou");
        arrLst.add("Ballack");

        // Traverse elements 
        //for each method
        for (String element : linkedLst) {
            System.out.println(element);
        }
        //Iterator method
        Iterator<String> iterateLinkedList = linkedLst.iterator();
        while (iterateLinkedList.hasNext()) {
            System.out.println(iterateLinkedList.next());
        }

    }
}
