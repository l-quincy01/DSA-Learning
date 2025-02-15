# 📂 Heaps (Priority Queue)

**Heaps** are specialised tree-based data structures that can be used as priority queues. They are essential for efficiently accessing the minimum or maximum element and are widely applied in various algorithmic problems.

## 📌 **Common Problems**

1. **Implement a Min/Max Heap**
2. **Find Kth Largest/Smallest Element**
3. **Merge K Sorted Arrays**
4. **Find the Median from a Data Stream**
5. **Top K Frequent Elements**
6. **Sliding Window Maximum**

## Approach

### **1️⃣ Heap Construction & Operations**

- **Array Representation:** Use arrays to implement complete binary trees.
- **Insertion:** Add the new element at the end and heapify upwards.
- **Deletion:** Remove the root, replace it with the last element, then heapify downwards.

### **2️⃣ Problem-Specific Strategies**

- **Kth Element Problems:** Maintain a fixed-size heap to efficiently track the kth largest or smallest element.
- **Merging Sorted Arrays:** Use a min-heap to keep track of the smallest current element from each array.
- **Median from Data Stream:** Employ two heaps (min-heap and max-heap) to dynamically balance and retrieve the median.
- **Top K Frequent Elements & Sliding Window Maximum:** Leverage heaps to maintain optimal elements for each sliding window or frequency count.

## Read Up

- [Heap Data Structure - GeeksforGeeks](https://www.geeksforgeeks.org/heap-data-structure/)
- [Priority Queue and Heap Problems on LeetCode](https://leetcode.com/tag/heap/)
- [Median of Data Stream - GeeksforGeeks](https://www.geeksforgeeks.org/median-of-stream-of-integers-running-integers/)
