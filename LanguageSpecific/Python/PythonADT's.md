# Python Data Structures

This document outlines commonly used Python data structures, their descriptions, common methods, and Java equivalents.

---

## 1. **List**

- **Description**: Dynamic array for ordered data. Supports indexing, slicing, and various methods for modification.
- **Java Equivalent**: `ArrayList`

### Common Methods:

- **`append(x)`**: Adds an element to the end of the list.
- **`pop([i])`**: Removes and returns the element at index `i` (default last).
- **`insert(i, x)`**: Inserts `x` at index `i`.
- **`remove(x)`**: Removes the first occurrence of `x`.
- **`sort()`**: Sorts the list in place.

```python
# List example
my_list = [1, 2, 3]
my_list.append(4)  # Add an element
my_list.pop()      # Remove the last element
my_list.insert(1, 5)  # Insert at index 1
print(my_list)



```

---

## 2. **Tuple**

- **Description**: Immutable, ordered collection. Often used for fixed-size or hashable data.
- **Java Equivalent**: `Pair` or `ImmutableList` (via third-party libraries like Guava)

### Common Methods:

- **`count(x)`**: Returns the count of `x` in the tuple.
- **`index(x)`**: Returns the first index of `x`.

```python
# Tuple example
my_tuple = (1, 2, 3)
print(my_tuple.count(2))  # Count occurrences of 2
print(my_tuple.index(3))  # Get the index of 3
```

---

## 3. **Set**

- **Description**: Unordered collection of unique elements. Efficient for membership checks.
- **Java Equivalent**: `HashSet`

### Common Methods:

- **`add(x)`**: Adds an element to the set.
- **`remove(x)`**: Removes `x`; raises an error if not present.
- **`discard(x)`**: Removes `x` without raising an error.
- **`union(other)`**: Returns the union of two sets.
- **`intersection(other)`**: Returns the intersection of two sets.

```python
# Set example
my_set = {1, 2, 3}
my_set.add(4)         # Add an element
my_set.remove(2)      # Remove an element
print(my_set.union({5, 6}))  # Union with another set
```

---

## 4. **Dictionary**

- **Description**: Key-value pairs with fast lookups.
- **Java Equivalent**: `HashMap`

### Common Methods:

- **`get(key, default)`**: Returns the value for `key` or `default` if key is absent.
- **`keys()`**: Returns a view of the dictionary’s keys.
- **`values()`**: Returns a view of the dictionary’s values.
- **`items()`**: Returns a view of key-value pairs.

```python
# Dictionary example
my_dict = {"a": 1, "b": 2}
print(my_dict.get("a"))  # Access a value
my_dict["c"] = 3         # Add a new key-value pair
print(my_dict)
```

---

## 5. **String**

- **Description**: Immutable sequence of characters. Treated like a list in terms of slicing.
- **Java Equivalent**: `String`

### Common Methods:

- **`split(delim)`**: Splits the string by the delimiter and returns a list.
- **`join(iterable)`**: Joins elements of an iterable with the string as a separator.
- **`strip()`**: Removes leading/trailing whitespace.
- **`replace(old, new)`**: Replaces occurrences of `old` with `new`.

```python
# String example
s = "hello world"
print(s.split(" "))  # Split into words
print(" ".join(["hello", "world"]))  # Join words into a sentence
```

---

## 6. **Deque**

- **Description**: Double-ended queue with O(1) operations for adding/removing from both ends.
- **Java Equivalent**: `ArrayDeque`

### Common Methods:

- **`append(x)`**: Adds `x` to the right end.
- **`appendleft(x)`**: Adds `x` to the left end.
- **`pop()`**: Removes and returns an element from the right.
- **`popleft()`**: Removes and returns an element from the left.

```python
from collections import deque

dq = deque([1, 2, 3])
dq.append(4)      # Add to the right
dq.appendleft(0)  # Add to the left
dq.pop()          # Remove from the right
dq.popleft()      # Remove from the left
print(dq)

```

---

## 7. **Heap (Priority Queue)**

- **Description**: Min-heap by default using `heapq` for priority queue operations.
- **Java Equivalent**: `PriorityQueue`

### Common Methods:

- **`heappush(heap, x)`**: Adds `x` to the heap.
- **`heappop(heap)`**: Removes and returns the smallest element.
- **`heapify(iterable)`**: Converts an iterable into a heap.

```python
import heapq

heap = []
heapq.heappush(heap, 3)
heapq.heappush(heap, 1)
heapq.heappush(heap, 2)
print(heapq.heappop(heap))  # Removes smallest element

```

---

## 8. **Counter**

- **Description**: Subclass of `dict` for counting hashable items.
- **Java Equivalent**: Use `HashMap` with manual tallying and sorting.

### Common Methods:

- **`most_common(n)`**: Returns the `n` most common elements.
- **`update(iterable)`**: Adds counts for elements in the iterable.
- **`subtract(iterable)`**: Subtracts counts for elements in the iterable.

```python
from collections import Counter

counter = Counter([1, 2, 2, 3, 3, 3])
print(counter.most_common(2))  # Two most common elements

```

---

## 9. **DefaultDict**

- **Description**: `dict` with a default value for missing keys.
- **Java Equivalent**: `computeIfAbsent(key, k -> defaultValue)`.

### Common Methods:

- **`default_factory`**: Provides a default value when a missing key is accessed.

```python
from collections import defaultdict

default_dict = defaultdict(int)
default_dict["a"] += 1
print(default_dict)


```

---

## 10. **Array**

- **Description**: Fixed-size array from the `array` module. Less commonly used.
- **Java Equivalent**: `Array`

### Common Methods:

- **`append(x)`**: Adds an element to the array.
- **`pop([i])`**: Removes and returns the element at index `i` (default last).

```python
import array

# Create an array of integers
arr = array.array('i', [1, 2, 3])
arr.append(4)  # Add an element
print(arr.pop())  # Remove and return the last element
print(arr)
```

---

## 11. **Stack**

- **Description**: Often implemented using a `list` or `deque` for LIFO behavior.
- **Java Equivalent**: `Stack` (deprecated, prefer `ArrayDeque`).

### Common Methods:

- **`append(x)`**: Pushes an element to the top.
- **`pop()`**: Removes and returns the top element.

```python
# Stack using a list
stack = []
stack.append(1)  # Push an element
stack.append(2)
print(stack.pop())  # Remove and return the top element
print(stack)
```

---

## 12. **Queue**

- **Description**: FIFO queue using `collections.deque` or `queue.Queue`.
- **Java Equivalent**: `LinkedList` or `ArrayDeque`

### Common Methods:

- **`put(x)`**: Adds an element to the queue.
- **`get()`**: Removes and returns an element from the front.

```python
from collections import deque

# Queue using deque
queue = deque()
queue.append(1)  # Enqueue an element
queue.append(2)
print(queue.popleft())  # Dequeue and return the front element
print(queue)
```

---

## 13. **Graph**

- **Description**: Represented using adjacency lists (defaultdict of lists/sets) or adjacency matrices (2D list).
- **Java Equivalent**: Use `HashMap<Integer, List<Integer>>`.

### Common Methods:

- **`add_edge(u, v)`**: Adds an edge between nodes `u` and `v`.
- **`neighbors(u)`**: Returns the neighbors of node `u`.

```python
from collections import defaultdict

# Graph as adjacency list
graph = defaultdict(list)

def add_edge(u, v):
    graph[u].append(v)
    graph[v].append(u)

def neighbors(u):
    return graph[u]

add_edge(1, 2)
add_edge(1, 3)
print(neighbors(1))  # Get neighbors of node 1
```

---

## 14. **Linked List**

- **Description**: Not a built-in data structure, but commonly implemented for LeetCode problems.
- **Java Equivalent**: Custom class or `LinkedList`.

### Common Methods:

- **`insert(position, x)`**: Inserts `x` at a specific position.
- **`delete(position)`**: Deletes the element at a specific position.

```python
class Node:
    def __init__(self, data):
        self.data = data
        self.next = None

class LinkedList:
    def __init__(self):
        self.head = None



```

---
