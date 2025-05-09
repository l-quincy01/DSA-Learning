# Common Programming Patterns and Algorithms

## Sliding Window

**Brief Explanation:** Efficiently processes contiguous subarrays or substrings of a fixed or variable size.

**When to Use:** When you need to find something (like maximum, minimum, or a specific condition) within all possible contiguous subarrays or substrings.

**Look Out For:** Problems involving subarrays or substrings where you can maintain a "window" that slides through the data.

**Skeleton Implementation (Java):**
```java
public void slidingWindow(int[] arr, int windowSize) {
    int windowStart = 0;
    for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
        // Expand the window

        if (windowEnd >= windowSize - 1) {
            // Do something with the window
            // ...

            // Shrink the window
            windowStart++;
        }
    }
}
```

## Prefix Sum

**Brief Explanation:** Computes an array where each element is the sum of all preceding elements (including itself) in the original array.

**When to Use:** When you need to efficiently calculate the sum of elements within a given range of an array multiple times.

**Look Out For:** Problems asking for range sums frequently.

**Skeleton Implementation (Java):**
```java
public int[] prefixSum(int[] arr) {
    int[] prefix = new int[arr.length];
    if (arr.length > 0) {
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }
    }
    return prefix;
}
```

## Two Pointers

**Brief Explanation:** Uses two pointers to iterate through a data structure (often an array or linked list) in a coordinated way.

**When to Use:** Often used to find pairs, merge sorted lists, or solve problems with sorted input.

**Look Out For:** Problems involving sorted arrays/lists or needing to find pairs that satisfy a condition.

**Skeleton Implementation (Java):**
```java
public void twoPointers(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
        // Do something with arr[left] and arr[right]
        // ...
        left++;
        right--;
    }
}
```

## Slow & Fast Pointers

**Brief Explanation:** Employs two pointers that traverse a data structure at different speeds, often used in linked lists.

**When to Use:** Primarily used to detect cycles in linked lists or find the middle element.

**Look Out For:** Problems involving linked lists where you need to find a cycle or a specific position relative to the start.

**Skeleton Implementation (Java):**
```java
public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }

public boolean slowFastPointers(ListNode head) {
    ListNode slow = head;
    ListNode fast = head;
    while (fast != null && fast.next != null) {
        slow = slow.next;
        fast = fast.next.next;
        if (slow == fast) {
            return true; // Cycle detected
        }
    }
    return false;
}
```

## LinkedList In-Place Reversal

**Brief Explanation:** Reverses the direction of a singly linked list by modifying the next pointers without using extra space.

**When to Use:** When you need to reverse the order of elements in a linked list efficiently in terms of space.

**Look Out For:** Problems specifically asking to reverse a linked list.

**Skeleton Implementation (Java):**
```java
public static class ListNode { int val; ListNode next; ListNode(int val) { this.val = val; } }

public ListNode reverseLinkedList(ListNode head) {
    ListNode prev = null;
    ListNode current = head;
    while (current != null) {
        ListNode nextTemp = current.next;
        current.next = prev;
        prev = current;
        current = nextTemp;
    }
    return prev;
}
```

## Monotonic Stack

**Brief Explanation:** Uses a stack to maintain elements in either increasing or decreasing order to efficiently solve problems involving finding the next greater/smaller element.

**When to Use:** When you need to find the next greater element, previous smaller element, or solve problems related to ranges and heights.

**Look Out For:** Problems where you need to find the nearest element (to the left or right) that satisfies a certain ordering property.

**Skeleton Implementation (Java):**
```java
import java.util.Stack;

public void monotonicStack(int[] arr) {
    Stack<Integer> stack = new Stack<>();
    for (int i = 0; i < arr.length; i++) {
        while (!stack.isEmpty() && arr[i] /* comparison with stack top */) {
            // Process element from stack
            stack.pop();
        }
        stack.push(i);
    }
    // Process remaining elements in the stack
}
```

## Top K Elements

**Brief Explanation:** Focuses on finding the K largest, smallest, or most frequent elements in a dataset.

**When to Use:** When you need to retrieve a specific number of extreme or frequent items.

**Look Out For:** Problems asking for the "top K", "K largest", "K smallest", or "K most frequent".

**Skeleton Implementation (Java) - using a min-heap for top K largest:**
```java
import java.util.PriorityQueue;

public int[] topKElements(int[] nums, int k) {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    for (int n : nums) {
        minHeap.add(n);
        if (minHeap.size() > k) {
            minHeap.poll();
        }
    }
    int[] result = new int[k];
    for (int i = k - 1; i >= 0; i--) {
        result[i] = minHeap.poll();
    }
    return result;
}
```

## Normal and Modified Binary Search

**Brief Explanation:** An efficient search algorithm for sorted data, with modifications to handle variations like finding the first/last occurrence or searching in rotated arrays.

**When to Use:** When searching for a specific element in a sorted array or when the problem has a monotonic search space.

**Look Out For:** Problems involving sorted arrays and the need for efficient searching.

**Skeleton Implementation (Java) - Normal Binary Search:**
```java
public int binarySearch(int[] arr, int target) {
    int left = 0;
    int right = arr.length - 1;
    while (left <= right) {
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left = mid + 1;
        } else {
            right = mid - 1;
        }
    }
    return -1; // Not found
}
```

## Binary Tree Traversal

**Brief Explanation:** Refers to different ways of visiting (processing) each node in a binary tree: inorder, preorder, and postorder.

**When to Use:** When you need to process all nodes in a binary tree in a specific order, often for tasks like printing, searching, or evaluating expressions.

**Look Out For:** Problems involving binary trees where you need to visit each node.

**Skeleton Implementation (Java) - Inorder Traversal (Recursive):**
```java
public static class TreeNode { int val; TreeNode left; TreeNode right; TreeNode(int val) { this.val = val; } }

public void inorderTraversal(TreeNode root) {
    if (root != null) {
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }
}
```

## Depth First Search (DFS)

**Brief Explanation:** Explores as far as possible along each branch before backtracking. Commonly used for graph and tree traversal.

**When to Use:** For tasks like finding paths, checking connectivity, and exploring all possibilities in a tree or graph.

**Look Out For:** Problems involving graphs or trees where you need to explore deeply along branches.

**Skeleton Implementation (Java) - Recursive DFS on a graph:**
```java
import java.util.List;
import java.util.Set;
import java.util.HashSet;

public void dfs(int node, List<List<Integer>> adj, Set<Integer> visited) {
    visited.add(node);
    System.out.print(node + " ");
    for (int neighbor : adj.get(node)) {
        if (!visited.contains(neighbor)) {
            dfs(neighbor, adj, visited);
        }
    }
}
```

## Breadth First Search (BFS)

**Brief Explanation:** Explores all the neighbor nodes at the present depth prior to moving on to the nodes at the next depth level.

**When to Use:** For finding the shortest path in an unweighted graph, level-order traversal of a tree.

**Look Out For:** Problems involving shortest paths in unweighted graphs or level-by-level processing of trees.

**Skeleton Implementation (Java) - BFS on a graph:**
```java
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Set;
import java.util.HashSet;

public void bfs(int startNode, List<List<Integer>> adj, Set<Integer> visited) {
    Queue<Integer> queue = new LinkedList<>();
    visited.add(startNode);
    queue.offer(startNode);
    while (!queue.isEmpty()) {
        int node = queue.poll();
        System.out.print(node + " ");
        for (int neighbor : adj.get(node)) {
            if (!visited.contains(neighbor)) {
                visited.add(neighbor);
                queue.offer(neighbor);
            }
        }
    }
}
```

## Backtrack

**Brief Explanation:** A general algorithmic technique for finding all (or some) solutions to computational problems, particularly constraint satisfaction problems, by incrementally building candidates to the solutions, and abandoning a candidate ("backtracking") as soon as it determines that this candidate cannot possibly lead to a valid solution.

**When to Use:** For problems that involve finding all possible combinations, permutations, or subsets that satisfy certain constraints.

**Look Out For:** Problems asking for "all possible...", or where you need to explore multiple choices.

**Skeleton Implementation (Java):**
```java
import java.util.List;
import java.util.ArrayList;

public void backtrack(List<Integer> currentCombination, List<List<Integer>> result, /* other parameters */) {
    // Base case: if a solution is found, add it to the result
    // ...

    // Recursive step: try all possible choices
    for (/* each choice */) {
        // Make the choice
        currentCombination.add(/* choice */);
        backtrack(currentCombination, result, /* updated parameters */);
        // Backtrack: undo the choice
        currentCombination.remove(currentCombination.size() - 1);
    }
}
```

## Dynamic Programming

**Brief Explanation:** Solves problems by breaking them down into smaller overlapping subproblems, solving each subproblem only once, and storing the solutions to avoid redundant computations.

**When to Use:** For optimization problems where the problem has optimal substructure and overlapping subproblems.

**Look Out For:** Problems asking for the maximum/minimum of something, or counting the number of ways to do something, where the solution to a larger problem can be built from the solutions of smaller, related subproblems.

**Skeleton Implementation (Java) - using memoization (top-down):**
```java
import java.util.Arrays;

public int dynamicProgramming(int n, int[] memo) {
    if (memo[n] != -1) {
        return memo[n];
    }
    if (n <= 1) {
        return n;
    }
    memo[n] = dynamicProgramming(n - 1, memo) + dynamicProgramming(n - 2, memo); // Example: Fibonacci
    return memo[n];
}

// Usage:
// int n = 10;
// int[] memo = new int[n + 1];
// Arrays.fill(memo, -1);
// int result = dynamicProgramming(n, memo);
```