# Data Structures and Algorithms Theory Guide

## Table of Contents
1. [Introduction](#introduction)
2. [Time and Space Complexity](#time-and-space-complexity)
3. [Linear Data Structures](#linear-data-structures)
4. [Non-Linear Data Structures](#non-linear-data-structures)
5. [Hash-Based Structures](#hash-based-structures)
6. [Specialized Data Structures](#specialized-data-structures)
7. [Algorithm Design Paradigms](#algorithm-design-paradigms)
8. [Sorting Algorithms](#sorting-algorithms)
9. [Searching Algorithms](#searching-algorithms)
10. [Graph Algorithms](#graph-algorithms)


---

## Time and Space Complexity

### Big O Notation
Big O notation describes the upper bound of an algorithm's time or space complexity as input size approaches infinity.

**Common Time Complexities (from best to worst):**
- O(1) - Constant time
- O(log n) - Logarithmic time
- O(n) - Linear time
- O(n log n) - Linearithmic time
- O(n²) - Quadratic time
- O(n³) - Cubic time
- O(2ⁿ) - Exponential time
- O(n!) - Factorial time


---

## Linear Data Structures

### 1. Arrays

**Definition:** A collection of elements stored in contiguous memory locations, accessed by index.

**Characteristics:**
- Fixed size (in most languages)
- Homogeneous elements
- Random access via indexing
- Cache-friendly due to spatial locality

**Operations & Complexities:**
- Access: O(1)
- Search: O(n) unsorted, O(log n) sorted
- Insertion: O(n) worst case, O(1) at end
- Deletion: O(n) worst case, O(1) at end

**Use Cases:**
- Mathematical operations and matrices
- Lookup tables
- Building blocks for other data structures

**Dynamic Arrays (Vectors/ArrayLists):**
- Resizable arrays that automatically grow
- Amortized O(1) insertion at end
- Typically double in size when capacity exceeded

### 2.Linked Lists

**Definition:** A linear collection of nodes where each node contains data and a reference to the next node.

**Types:**

**Singly Linked List:**
- Each node points to the next node
- Operations: O(1) insertion/deletion at head, O(n) at arbitrary position
- Space efficient with no wasted memory

**Doubly Linked List:**
- Each node has pointers to both next and previous nodes
- Enables bidirectional traversal
- Slightly more memory overhead

**Circular Linked List:**
- Last node points back to the first node
- Useful for round-robin scheduling

**Operations & Complexities:**
- Access: O(n)
- Search: O(n)
- Insertion: O(1) at head/tail with pointer, O(n) at arbitrary position
- Deletion: O(1) with node reference, O(n) by value

**Use Cases:**
- Dynamic memory allocation
- Undo functionality
- Music playlists (circular)
- Implementation of other data structures

### 3.Stacks

**Definition:** A Last-In-First-Out (LIFO) data structure where elements are added and removed from the same end (top).

**Core Operations:**
- Push: Add element to top - O(1)
- Pop: Remove top element - O(1)
- Peek/Top: View top element without removing - O(1)
- IsEmpty: Check if stack is empty - O(1)

**Implementation:**
- Array-based: Fixed size, cache-friendly
- Linked list-based: Dynamic size, more memory overhead

**Use Cases:**
- Function call management (call stack)
- Expression evaluation and syntax parsing
- Undo operations
- Backtracking algorithms
- Browser history

### 4.Queues

**Definition:** A First-In-First-Out (FIFO) data structure where elements are added at rear and removed from front.

**Core Operations:**
- Enqueue: Add element to rear - O(1)
- Dequeue: Remove element from front - O(1)
- Front: View front element - O(1)
- IsEmpty: Check if queue is empty - O(1)

**Types:**

**Simple Queue:**
- Basic FIFO implementation
- Can be implemented with arrays or linked lists

**Circular Queue:**
- Uses circular array to efficiently utilize space
- Prevents the need to shift elements

**Priority Queue:**
- Elements have associated priorities
- Higher priority elements dequeued first
- Often implemented using heaps

**Double-Ended Queue (Deque):**
- Insertion and deletion possible at both ends
- Combines stack and queue functionality

**Use Cases:**
- Task scheduling in operating systems
- Breadth-first search
- Print job management
- Handling requests in web servers

---

## Hash-Based Structures

### Hash Tables

**Definition:** Hashtables are a type of data structure in which the address/index value of the data element is generated from a hash function, enabling fast data access.
<br/>
OR
<br/>
A data structure that implements an associative array using a hash function to compute an index into an array of buckets.

**Hash Functions:**
- Should distribute keys uniformly
- Should be deterministic and fast to compute
- Common methods: Division, multiplication, universal hashing

**Collision Resolution:**

**Chaining:**
- Each bucket contains a linked list of colliding elements
- Simple to implement
- Performance degrades gracefully
- Requires extra memory for pointers

**Open Addressing:**
- All elements stored in the hash table array
- When collision occurs, probe for next available slot
- Types: Linear probing, quadratic probing, double hashing
- Better cache performance
- Can suffer from clustering

**Operations:**
- Insert: O(1) average, O(n) worst case
- Delete: O(1) average, O(n) worst case
- Search: O(1) average, O(n) worst case

**Load Factor:**
- Ratio of number of elements to number of buckets
- Affects performance and collision probability
- Typically kept below 0.75 for good performance

**Use Cases:**
- Database indexing
- Caches and memoization
- Symbol tables in compilers
- Set and map implementations

--- 

## Non-Linear Data Structures

### Trees

**Definition:** A hierarchical data structure consisting of nodes connected by edges, with one root node and no cycles.

**Terminology:**
- Root: Top node with no parent
- Leaf: Node with no children
- Height: Longest path from root to leaf
- Depth: Distance from root to a node
- Degree: Number of children of a node

**Binary Trees:**

**Properties:**
- Each node has at most two children (left and right)
- Height ranges from log n (balanced) to n (skewed)

**Types:**

**Full Binary Tree:** Every node has either 0 or 2 children

**Complete Binary Tree:** All levels filled except possibly the last, which is filled left to right

**Perfect Binary Tree:** All internal nodes have two children and all leaves at same level

**Binary Search Tree (BST):**
- Left subtree contains values less than root
- Right subtree contains values greater than root
- Enables efficient searching, insertion, and deletion

**BST Operations:**
- Search: O(log n) average, O(n) worst case
- Insertion: O(log n) average, O(n) worst case
- Deletion: O(log n) average, O(n) worst case
- Traversal: O(n)

**Tree Traversals:**
- Inorder (Left, Root, Right): Gives sorted order in BST
- Preorder (Root, Left, Right): Useful for copying tree
- Postorder (Left, Right, Root): Useful for deletion
- Level Order: Breadth-first traversal

**Balanced Trees:**

**AVL Tree:**
- Self-balancing BST
- Height difference between left and right subtrees ≤ 1
- Guarantees O(log n) operations
- More rigid balancing, frequent rotations

**Red-Black Tree:**
- Self-balancing BST with color properties
- Guarantees O(log n) operations
- Less rigid than AVL, fewer rotations
- Used in many standard libraries



### Heaps

**Definition:** A complete binary tree that satisfies the heap property.

**Heap Property Types:**

**Max Heap:** Parent nodes are greater than or equal to children
**Min Heap:** Parent nodes are less than or equal to children


**Implementation:**
- Usually implemented as arrays
- For node at index i:
  - Left child: 2i + 1
  - Right child: 2i + 2
  - Parent: (i-1)/2

**Use Cases:**
- Priority queues
- Heap sort algorithm
- Finding kth largest/smallest elements
- Graph algorithms (Dijkstra's, Prim's)

### Graphs

**Definition:** A collection of vertices (nodes) connected by edges, representing relationships between entities.

**Types:**

**Directed vs Undirected:**
- Directed: Edges have direction (arrows)
- Undirected: Edges are bidirectional

**Weighted vs Unweighted:**
- Weighted: Edges have associated costs/weights
- Unweighted: All edges have equal weight

**Connected vs Disconnected:**
- Connected: Path exists between any two vertices
- Disconnected: Some vertices are unreachable

**Cyclic vs Acyclic:**
- Cyclic: Contains at least one cycle
- Acyclic: No cycles (DAG - Directed Acyclic Graph)

**Representation:**

**Adjacency Matrix:**
- 2D array where matrix[i][j] represents edge from vertex i to j
- Space: O(V²)
- Edge lookup: O(1)
- Good for dense graphs

**Adjacency List:**
- Array of lists where each list contains neighbors of a vertex
- Space: O(V + E)
- Edge lookup: O(degree of vertex)
- Good for sparse graphs

**Common Graph Problems:**
- Shortest path (Dijkstra's, Bellman-Ford)
- Minimum spanning tree (Kruskal's, Prim's)
- Topological sorting
- Cycle detection
- Connectivity and strongly connected components


---

## Specialized Data Structures

### Tries (Prefix Trees)

**Definition:** A tree-like data structure used to store a dynamic set of strings, where each path from root to leaf represents a word.

**Structure:**
- Each node represents a character
- Root represents empty string
- Path from root to node represents a prefix
- Leaf nodes (or marked nodes) represent complete words

**Operations:**
- Insert: O(m) where m is length of string
- Search: O(m)
- Delete: O(m)
- Prefix matching: O(p) where p is prefix length

**Space Optimization:**
- Compressed tries (Patricia trees) merge chains of single-child nodes
- Reduces space complexity for sparse tries

**Use Cases:**
- Autocomplete and spell checkers
- IP routing tables
- Bioinformatics for DNA sequence analysis
- Dictionary implementations

### Disjoint Set (Union-Find)

**Definition:** A data structure that keeps track of elements partitioned into disjoint sets, supporting efficient union and find operations.

**Operations:**
- Find: Determine which set an element belongs to
- Union: Merge two sets containing given elements
- MakeSet: Create a new set with single element

**Optimizations:**
- Path Compression: Make find operations faster by flattening tree structure
- Union by Rank/Size: Attach smaller tree under root of larger tree

**Time Complexity:**
- With both optimizations: Nearly O(1) amortized time per operation
- Actual complexity: O(α(n)) where α is inverse Ackermann function

**Use Cases:**
- Kruskal's minimum spanning tree algorithm
- Finding connected components in graphs
- Dynamic connectivity problems
- Percolation theory

### Segment Trees

**Definition:** A binary tree used for storing intervals or segments, allowing querying which segments contain a given point.

**Properties:**
- Each leaf represents a single element
- Each internal node represents a range/segment
- Supports range queries and updates efficiently

**Operations:**
- Range Query: O(log n)
- Point Update: O(log n)
- Range Update: O(log n) with lazy propagation

**Use Cases:**
- Range sum/minimum/maximum queries
- Computational geometry
- Database range queries

### Fenwick Tree (Binary Indexed Tree)

**Definition:** A data structure that can efficiently calculate prefix sums in logarithmic time.

**Operations:**
- Update: O(log n)
- Prefix Sum Query: O(log n)
- Range Sum Query: O(log n)

**Advantages:**
- Simple implementation
- Lower memory overhead than segment trees
- Cache-friendly

**Use Cases:**
- Cumulative frequency tables
- Range sum queries
- Inversion counting

---

## Algorithm Design Paradigms

### Divide and Conquer

**Principle:** Break problem into smaller subproblems, solve recursively, and combine results.

**Template:**
1. Divide: Split problem into subproblems
2. Conquer: Solve subproblems recursively
3. Combine: Merge solutions

**Examples:**
- Merge Sort: O(n log n)
- Quick Sort: O(n log n) average
- Binary Search: O(log n)
- Fast Fourier Transform: O(n log n)

**Time Complexity Analysis:**
- Master Theorem for recurrence relations
- T(n) = aT(n/b) + f(n)

### Dynamic Programming

**Principle:** Solve complex problems by breaking them into overlapping subproblems and storing results to avoid recomputation.

**Approaches:**

**Top-Down (Memoization):**
- Recursive approach with caching
- Natural problem decomposition
- May have function call overhead

**Bottom-Up (Tabulation):**
- Iterative approach building solution from base cases
- Better space and time constants
- Less intuitive problem decomposition

**Key Characteristics:**
- Optimal substructure: Optimal solution contains optimal solutions to subproblems
- Overlapping subproblems: Same subproblems solved multiple times

**Classic Problems:**
- Fibonacci sequence: O(n)
- Longest Common Subsequence: O(mn)
- Knapsack Problem: O(nW)
- Edit Distance: O(mn)
- Coin Change: O(nC)

### Greedy Algorithms

**Principle:** Make locally optimal choices at each step, hoping to find global optimum.

**Properties:**
- Greedy choice property: Local optimum leads to global optimum
- Optimal substructure: Optimal solution contains optimal solutions to subproblems

**Examples:**
- Activity Selection: O(n log n)
- Huffman Coding: O(n log n)
- Fractional Knapsack: O(n log n)
- Minimum Spanning Tree (Kruskal's, Prim's)

**Limitations:**
- Doesn't always produce optimal solution
- Requires proof of correctness
- Problem-specific approach

### Backtracking

**Principle:** Systematically explore all possible solutions by building solution incrementally and abandoning candidates that cannot lead to valid solution.

**Template:**
1. Choose: Make a choice from available options
2. Explore: Recursively explore with this choice
3. Unchoose: Backtrack if solution not found

**Examples:**
- N-Queens Problem: O(N!)
- Sudoku Solver: Exponential
- Graph Coloring: Exponential
- Subset Sum: O(2ⁿ)

**Optimization Techniques:**
- Pruning: Eliminate branches that cannot lead to solution
- Constraint propagation: Reduce search space
- Heuristics: Guide search toward promising areas

---

## Sorting Algorithms

### Comparison-Based Sorts

**Bubble Sort:**
- Time: O(n²), Space: O(1)
- Stable, in-place
- Educational purposes only

**Selection Sort:**
- Time: O(n²), Space: O(1)
- Not stable, in-place
- Minimizes number of swaps

**Insertion Sort:**
- Time: O(n²) worst, O(n) best, Space: O(1)
- Stable, in-place
- Efficient for small arrays and nearly sorted data

**Merge Sort:**
- Time: O(n log n), Space: O(n)
- Stable, not in-place
- Consistent performance, good for linked lists

**Quick Sort:**
- Time: O(n log n) average, O(n²) worst, Space: O(log n)
- Not stable, in-place
- Fast in practice, cache-friendly

**Heap Sort:**
- Time: O(n log n), Space: O(1)
- Not stable, in-place
- Consistent performance, good worst-case guarantee

### Non-Comparison Sorts

**Counting Sort:**
- Time: O(n + k), Space: O(k)
- Stable, requires known range
- k is range of input values

**Radix Sort:**
- Time: O(d × n), Space: O(n + k)
- Stable, works for integers
- d is number of digits

**Bucket Sort:**
- Time: O(n + k) average, O(n²) worst, Space: O(n + k)
- Stable, requires uniform distribution
- Good for floating-point numbers

---

## Searching Algorithms

### Linear Search
- Time: O(n), Space: O(1)
- Works on unsorted arrays
- Simple implementation

### Binary Search
- Time: O(log n), Space: O(1) iterative, O(log n) recursive
- Requires sorted array
- Divide and conquer approach

**Variants:**
- First occurrence
- Last occurrence
- Floor and ceiling values

### Hash-Based Search
- Time: O(1) average, O(n) worst
- Requires hash table
- Excellent for exact matches

### Tree-Based Search
- Binary Search Tree: O(log n) average, O(n) worst
- Balanced trees (AVL, Red-Black): O(log n) guaranteed
- Support range queries and ordered traversal

---

## Graph Algorithms

### Traversal Algorithms

**Breadth-First Search (BFS):**
- Time: O(V + E), Space: O(V)
- Uses queue data structure
- Finds shortest path in unweighted graphs
- Level-by-level exploration

**Depth-First Search (DFS):**
- Time: O(V + E), Space: O(V)
- Uses stack (recursion or explicit)
- Useful for topological sorting and cycle detection
- Goes as deep as possible before backtracking

### Shortest Path Algorithms

**Dijkstra's Algorithm:**
- Time: O((V + E) log V) with binary heap
- Single-source shortest path
- Works with non-negative weights
- Uses greedy approach with priority queue

**Bellman-Ford Algorithm:**
- Time: O(VE)
- Single-source shortest path
- Handles negative weights
- Detects negative cycles

**Floyd-Warshall Algorithm:**
- Time: O(V³), Space: O(V²)
- All-pairs shortest path
- Dynamic programming approach
- Works with negative weights (no negative cycles)

### Minimum Spanning Tree

**Kruskal's Algorithm:**
- Time: O(E log E)
- Uses disjoint set data structure
- Processes edges in order of weight
- Greedy approach

**Prim's Algorithm:**
- Time: O(E log V) with binary heap
- Uses priority queue
- Grows tree from starting vertex
- Greedy approach

### Topological Sorting

**Kahn's Algorithm:**
- Time: O(V + E)
- Uses queue and in-degree counting
- BFS-based approach

**DFS-Based:**
- Time: O(V + E)
- Uses DFS and stack
- Natural recursive approach

### Strongly Connected Components

**Kosaraju's Algorithm:**
- Time: O(V + E)
- Two DFS passes
- Simple to implement

**Tarjan's Algorithm:**
- Time: O(V + E)
- Single DFS pass
- More complex but efficient

---

## Conclusion

Understanding data structures and algorithms is fundamental to writing efficient code and solving complex computational problems. The choice of appropriate data structure depends on the specific requirements of your application, including the types of operations needed, performance constraints, and memory limitations.

Key principles for success:
- Understand the trade-offs between different approaches
- Consider both time and space complexity
- Choose the right tool for the problem
- Practice implementing these concepts
- Analyze real-world applications and requirements

This theoretical foundation provides the basis for tackling advanced topics like distributed algorithms, parallel computing, and specialized problem domains. Continue practicing with coding problems and real-world applications to deepen your understanding and improve your problem-solving skills.
