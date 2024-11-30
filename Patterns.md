# Common Data Structures and Algorithms (DSA) Patterns and LeetCode Practice Problems

### 1. Prefix Sum Pattern

- **Use**: Query the sum of elements in a subarray efficiently when there are multiple queries.
- **Example Problems**: [Range Sum Query](https://leetcode.com/problems/range-sum-query-immutable/), [Subarray Sum Equals K](https://leetcode.com/problems/subarray-sum-equals-k/)

```python
# Prefix Sum Example
nums = [1, 2, 3, 4, 5]
prefix_sum = [0] * (len(nums) + 1)
for i in range(len(nums)):
    prefix_sum[i + 1] = prefix_sum[i] + nums[i]

# Query sum of elements from index 1 to 3
sum_1_to_3 = prefix_sum[4] - prefix_sum[1]
print(sum_1_to_3)  # Output: 9 (2 + 3 + 4)
```

### 2. Two Pointers Pattern

- **Use**: Optimizes comparisons of elements from different positions, like palindrome checks or pair-sum problems.
- **Example Problems**: [Valid Palindrome](https://leetcode.com/problems/valid-palindrome/), [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/)

```python
def two_sum(numbers, target):
    left, right = 0, len(numbers) - 1
    while left < right:
        current_sum = numbers[left] + numbers[right]
        if current_sum == target:
            return [left + 1, right + 1]
        elif current_sum < target:
            left += 1
        else:
            right -= 1

```

### 3. Sliding Window Pattern

- **Use**: Finds subarrays or substrings with specific properties, often used to find max or min sums.
- **Example Problems**: [Maximum Sum of Subarray](https://leetcode.com/problems/maximum-subarray/), [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/)

```python
def max_sum_subarray(nums, k):
    window_sum = sum(nums[:k])
    max_sum = window_sum
    for i in range(len(nums) - k):
        window_sum += nums[i + k] - nums[i]
        max_sum = max(max_sum, window_sum)
    return max_sum

```

### 4. Fast and Slow Pointers Pattern

- **Use**: Common in linked list problems for detecting cycles or finding the middle node.
- **Example Problems**: [Linked List Cycle](https://leetcode.com/problems/linked-list-cycle/), [Middle of the Linked List](https://leetcode.com/problems/middle-of-the-linked-list/)

```python
def has_cycle(head):
    slow, fast = head, head
    while fast and fast.next:
        slow = slow.next
        fast = fast.next.next
        if slow == fast:
            return True
    return False

```

### 5. Linked List In-Place Reversal

- **Use**: Rearranges or reverses linked lists without extra space.
- **Example Problems**: [Reverse Linked List](https://leetcode.com/problems/reverse-linked-list/), [Reverse Nodes in k-Group](https://leetcode.com/problems/reverse-nodes-in-k-group/)

```python
def reverse_list(head):
    prev = None,
    curr = head
    while curr:
        next_node = curr.next
        curr.next = prev
        prev = curr
        curr = next_node
    return prev


```

### 6. Monotonic Stack Pattern

- **Use**: Uses a stack to find the next greater or smaller element in an array, optimizing time complexity.
- **Example Problems**: [Next Greater Element](https://leetcode.com/problems/next-greater-element-i/), [Daily Temperatures](https://leetcode.com/problems/daily-temperatures/)

```python
def next_greater_elements(nums):
    stack, res = [], [-1] * len(nums)
    for i, num in enumerate(nums):
        while stack and nums[stack[-1]] < num:
            res[stack.pop()] = num
        stack.append(i)
    return res

```

### 7. Top K Elements Pattern

- **Use**: Finds the K largest/smallest or most frequent elements, often using heaps.
- **Example Problems**: [Kth Largest Element](https://leetcode.com/problems/kth-largest-element-in-an-array/), [Top K Frequent Elements](https://leetcode.com/problems/top-k-frequent-elements/)

```python
import heapq

def top_k_frequent(nums, k):
    count = {}
    for num in nums:
        count[num] = count.get(num, 0) + 1
    return heapq.nlargest(k, count.keys(), key=count.get)


```

### 8. Overlapping Intervals Pattern

- **Use**: Works with intervals, such as merging or finding intersections.
- **Example Problems**: [Merge Intervals](https://leetcode.com/problems/merge-intervals/), [Insert Interval](https://leetcode.com/problems/insert-interval/)

```python
def merge_intervals(intervals):
    intervals.sort(key=lambda x: x[0])
    merged = []
    for interval in intervals:
        if not merged or merged[-1][1] < interval[0]:
            merged.append(interval)
        else:
            merged[-1][1] = max(merged[-1][1], interval[1])
    return merged


```

### 9. Modified Binary Search

- **Use**: Extends binary search for rotated or nearly sorted arrays, or finding specific positions.
- **Example Problems**: [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/), [Find Peak Element](https://leetcode.com/problems/find-peak-element/)

```python
def search_rotated(nums, target):
    left, right = 0, len(nums) - 1
    while left <= right:
        mid = (left + right) // 2
        if nums[mid] == target:
            return mid
        elif nums[left] <= nums[mid]:
            if nums[left] <= target < nums[mid]:
                right = mid - 1
            else:
                left = mid + 1
        else:
            if nums[mid] < target <= nums[right]:
                left = mid + 1
            else:
                right = mid - 1
    return -1


```

### 10. Binary Tree Traversals

- **Use**: Traverses binary trees in specific orders, such as pre-order, in-order, post-order, and level-order.
- **Example Problems**: [Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/), [Binary Tree Level Order Traversal](https://leetcode.com/problems/binary-tree-level-order-traversal/)

```python
def inorder_traversal(root):
    return inorder_traversal(root.left) + [root.val] + inorder_traversal(root.right) if root else []


```

### 11. Depth-First Search (DFS)

- **Use**: Explores all paths or branches in graphs/trees, ideal for finding paths or detecting cycles.
- **Example Problems**: [Path Sum](https://leetcode.com/problems/path-sum/), [Number of Connected Components](https://leetcode.com/problems/number-of-connected-components-in-an-undirected-graph/)

```python
def dfs(graph, start, visited=set()):
    if start in visited:
        return
    visited.add(start)
    for neighbor in graph[start]:
        dfs(graph, neighbor, visited)
    return visited


```

### 12. Breadth-First Search (BFS)

- **Use**: Traverses nodes level by level, often used for finding shortest paths.
- **Example Problems**: [Word Ladder](https://leetcode.com/problems/word-ladder/), [Minimum Depth of Binary Tree](https://leetcode.com/problems/minimum-depth-of-binary-tree/)

```python
from collections import deque

def bfs(graph, start):
    queue = deque([start])
    visited = {start}
    while queue:
        node = queue.popleft()
        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)
    return visited


```

### 13. Matrix Traversal

- **Use**: Solves matrix navigation problems by treating the matrix as a graph.
- **Example Problems**: [Number of Islands](https://leetcode.com/problems/number-of-islands/), [Shortest Path in Binary Matrix](https://leetcode.com/problems/shortest-path-in-binary-matrix/)

```python
def num_islands(grid):
    def dfs(i, j):
        if i < 0 or j < 0 or i >= len(grid) or j >= len(grid[0]) or grid[i][j] == '0':
            return
        grid[i][j] = '0'
        dfs(i + 1, j)
        dfs(i - 1, j)
        dfs(i, j + 1)
        dfs(i, j - 1)
    count = 0
    for i in range(len(grid)):
        for j in range(len(grid[0])):
            if grid[i][j] == '1':
                dfs(i, j)
                count += 1
    return count


```

### 14. Backtracking

- **Use**: Explores all potential solutions by making choices and backtracking when a path doesn’t lead to a solution.
- **Example Problems**: [N-Queens](https://leetcode.com/problems/n-queens/), [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/)

```python
def solve_n_queens(n):
    def dfs(queens, xy_dif, xy_sum):
        p = len(queens)
        if p == n:
            result.append(queens)
            return
        for q in range(n):
            if q not in queens and p - q not in xy_dif and p + q not in xy_sum:
                dfs(queens + [q], xy_dif + [p - q], xy_sum + [p + q])
    result = []
    dfs([], [], [])
    return [['.' * i + 'Q' + '.' * (n - i - 1) for i in sol] for sol in result]


```

### 15. Dynamic Programming (DP)

- **Use**: Breaks down optimization problems into subproblems, storing solutions to avoid redundancy.
- **Example Problems**: , [Coin Change](https://leetcode.com/problems/coin-change/), [Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)

```python
def climb_stairs(n):
    if n <= 2:
        return n
    a, b = 1, 2
    for _ in range(3, n + 1):
        a, b = b, a + b
    return b


```
