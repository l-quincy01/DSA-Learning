# Abstract Data Types (ADTs) in C# with Examples

## 1. List

Description: A collection of elements indexed by integers, allowing duplicates and dynamic resizing. List< T > is type-safe, whereas ArrayList stores elements as object.

**Types**: `List<T>`, `ArrayList`

```csharp
// Using List<T>
List<int> numbers = new List<int> { 1, 2, 3, 4 };
numbers.Add(5); // Adds 5 to the list
Console.WriteLine(numbers[2]); // Access element at index 2

// Using ArrayList
ArrayList mixedList = new ArrayList();
mixedList.Add(1);
mixedList.Add("hello");
mixedList.Add(3.14);
Console.WriteLine(mixedList[1]); // Access element at index 1
```

## 2. Array

Description: Fixed-size collection of elements of the same type. Offers efficient access via indexing.

**Types**: `Array`

```csharp
int[] array = { 1, 2, 3, 4 };
Console.WriteLine(array[2]); // Outputs 3
```

## 3. Dictionary(Map)

Description: A collection of key-value pairs where each key is unique. SortedDictionary keeps keys in sorted order

**Types**: `Dictionary<TKey, TValue>`, `SortedDictionary<TKey, TValue>`,

```csharp
// Using Dictionary<TKey, TValue>
Dictionary<string, int> dict = new Dictionary<string, int>();
dict["apple"] = 1;
dict["banana"] = 2;
Console.WriteLine(dict["apple"]); // Outputs 1

// Using SortedDictionary<TKey, TValue>
SortedDictionary<string, int> sortedDict = new SortedDictionary<string, int>();
sortedDict["z"] = 10;
sortedDict["a"] = 1;
foreach (var kvp in sortedDict)
{
    Console.WriteLine($"{kvp.Key}: {kvp.Value}"); // Outputs in sorted order by key
}
```

## 4. Linked List

Description: A doubly linked list that allows for efficient insertions and deletions. Can be used to implement other data structures like stacks and queues.

**Types**: `LinkedList<T>`

```csharp
LinkedList<int> linkedList = new LinkedList<int>();
linkedList.AddLast(1);
linkedList.AddLast(2);
linkedList.AddFirst(0);
foreach (var item in linkedList)
{
    Console.WriteLine(item); // Outputs 0, 1, 2
}
```

## 5. Queue

Description: Follows First-In-First-Out (FIFO) principle, where the first element added is the first one to be removed. Basic queue operations include Enqueue (add) and Dequeue (remove).

**Types**: `Queue<T>`

```csharp
Queue<int> queue = new Queue<int>();
queue.Enqueue(1);
queue.Enqueue(2);
queue.Enqueue(3);
Console.WriteLine(queue.Dequeue()); // Outputs 1
Console.WriteLine(queue.Peek()); // Outputs 2 without removing it
```

## 6. Stack

Description: Follows Last-In-First-Out (LIFO) principle, where the last element added is the first one to be removed. Operations include Push (add) and Pop (remove).

**Types**: `Stack<T>`

```csharp
Stack<string> stack = new Stack<string>();
stack.Push("first");
stack.Push("second");
stack.Push("third");
Console.WriteLine(stack.Pop()); // Outputs "third"
Console.WriteLine(stack.Peek()); // Outputs "second" without removing it
```

## 7. Set

Description: A collection that doesn’t allow duplicate elements. HashSet does not maintain order, while SortedSet keeps elements in sorted order.

**Types**: `HashSet<T>`, `SortedSet<T>`

```csharp
// Using HashSet<T>
HashSet<int> set = new HashSet<int> { 1, 2, 3 };
set.Add(2); // Duplicate values are ignored
Console.WriteLine(set.Contains(3)); // Outputs True

// Using SortedSet<T>
SortedSet<int> sortedSet = new SortedSet<int> { 3, 1, 2 };
foreach (var item in sortedSet)
{
    Console.WriteLine(item); // Outputs 1, 2, 3 in sorted order
}
```

## 8. Tree

Description: Hierarchical structure with nodes, each having zero or more children. Binary Trees, implemented by creating custom classes.

**Types**: Binary Tree, Binary Search Tree,
No built-in generic class for trees in C#
ONLY CUSTOM IMPLEMENTATIONS

```csharp
// Example of a simple binary tree node class
public class TreeNode
{
    public int Value;
    public TreeNode Left;
    public TreeNode Right;

    public TreeNode(int value)
    {
        Value = value;
        Left = Right = null;
    }
}

// Create nodes and build a binary tree
TreeNode root = new TreeNode(1);
root.Left = new TreeNode(2);
root.Right = new TreeNode(3);
root.Left.Left = new TreeNode(4);
root.Left.Right = new TreeNode(5);
```

## 9. Deque (Double-Ended Queue)

Description: Allows adding and removing elements from both ends, combining features of both stacks and queues.

**Types**: `LinkedList<T>`

```csharp
LinkedList<int> deque = new LinkedList<int>();
deque.AddLast(1); // Adds 1 at the end
deque.AddFirst(2); // Adds 2 at the beginning
Console.WriteLine(deque.First.Value); // Outputs 2
Console.WriteLine(deque.Last.Value); // Outputs 1

```

## 10. Graph

Description: A collection of elements indexed by integers, allowing duplicates and dynamic resizing. List<T> is type-safe, whereas ArrayList stores elements as object.

**Types**: Implementation: No built-in class; commonly implemented with Dictionary<T, List<T>> or Dictionary<T, HashSet<T>> for adjacency lists.

```csharp
// Using adjacency list representation
Dictionary<string, List<string>> graph = new Dictionary<string, List<string>>();
graph["A"] = new List<string> { "B", "C" };
graph["B"] = new List<string> { "A", "D" };
graph["C"] = new List<string> { "A", "D" };
graph["D"] = new List<string> { "B", "C" };

```
