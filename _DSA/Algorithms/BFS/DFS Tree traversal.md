
# 🌳 Tree Traversal Cheatsheet in Java

This guide covers the main tree traversal algorithms, including both **Depth-First Search (DFS)** and **Breadth-First Search (BFS)** approaches.

---

## 🔧 TreeNode Class

```java
class TreeNode {
    int val;
    TreeNode left, right;
    TreeNode(int val) {
        this.val = val;
    }
}
```


 <br /> <br />



# 🌐 Breadth-First Search (BFS)



## 1 Level Order Traversal

#### ✅ Use Cases:
- Finding shortest path in unweighted trees
- Printing levels
- Grouping nodes by level

#### 🔁 Iterative (Using Queue):

```java
void levelOrder(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        TreeNode node = queue.poll();
        System.out.print(node.val + " ");
        if (node.left != null) queue.offer(node.left);
        if (node.right != null) queue.offer(node.right);
    }
}
```



---

## 🧠 Summary Table

| Traversal      | Order                | Use Case                                | Type |
|----------------|----------------------|------------------------------------------|------|
| Inorder        | Left → Root → Right  | BST to sorted list                       | DFS  |
| Preorder       | Root → Left → Right  | Clone/serialize tree                     | DFS  |
| Postorder      | Left → Right → Root  | Delete/evaluate tree                     | DFS  |
| Level Order    | Level by level       | Shortest path, hierarchy printing        | BFS  |

---

## 📌 Tip

- Use **stack** for DFS (iterative)
- Use **queue** for BFS
- Recursive traversals are easier to code, but iterative gives more control and saves stack memory.

---
