
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

---

## 🧭 Depth-First Search (DFS) Traversals

DFS traversals go deep down a branch before backtracking.

---

### 1️⃣ Inorder Traversal (Left → Root → Right)

#### ✅ Use Cases:
- Binary Search Trees (BST): returns values in sorted order.
- Needed when order matters (e.g., converting BST to array).

#### 🔁 Recursive:

```java
void inorder(TreeNode root) {
    if (root == null) return;
    inorder(root.left);
    System.out.print(root.val + " ");
    inorder(root.right);
}
```

#### 🔁 Iterative:

```java
void inorderIterative(TreeNode root) {
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;
    while (curr != null || !stack.isEmpty()) {
        while (curr != null) {
            stack.push(curr);
            curr = curr.left;
        }
        curr = stack.pop();
        System.out.print(curr.val + " ");
        curr = curr.right;
    }
}
```

---

### 2️⃣ Preorder Traversal (Root → Left → Right)

#### ✅ Use Cases:
- Cloning trees
- Expression trees (prefix notation)
- Useful for serializing trees

#### 🔁 Recursive:

```java
void preorder(TreeNode root) {
    if (root == null) return;
    System.out.print(root.val + " ");
    preorder(root.left);
    preorder(root.right);
}
```

#### 🔁 Iterative:

```java
void preorderIterative(TreeNode root) {
    if (root == null) return;
    Stack<TreeNode> stack = new Stack<>();
    stack.push(root);
    while (!stack.isEmpty()) {
        TreeNode node = stack.pop();
        System.out.print(node.val + " ");
        if (node.right != null) stack.push(node.right);
        if (node.left != null) stack.push(node.left);
    }
}
```

---

### 3️⃣ Postorder Traversal (Left → Right → Root)

#### ✅ Use Cases:
- Deleting/freeing tree
- Evaluating postfix expressions
- Bottom-up computations

#### 🔁 Recursive:

```java
void postorder(TreeNode root) {
    if (root == null) return;
    postorder(root.left);
    postorder(root.right);
    System.out.print(root.val + " ");
}
```

#### 🔁 Iterative (Two Stack Method):

```java
void postorderIterative(TreeNode root) {
    if (root == null) return;
    Stack<TreeNode> stack1 = new Stack<>();
    Stack<TreeNode> stack2 = new Stack<>();
    stack1.push(root);
    while (!stack1.isEmpty()) {
        TreeNode node = stack1.pop();
        stack2.push(node);
        if (node.left != null) stack1.push(node.left);
        if (node.right != null) stack1.push(node.right);
    }
    while (!stack2.isEmpty()) {
        System.out.print(stack2.pop().val + " ");
    }
}
```

---

## 🌐 Breadth-First Search (BFS)

---

### 4️⃣ Level Order Traversal

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

#### 📦 With Level Tracking:

```java
void levelOrderWithLevels(TreeNode root) {
    if (root == null) return;
    Queue<TreeNode> queue = new LinkedList<>();
    queue.offer(root);
    while (!queue.isEmpty()) {
        int levelSize = queue.size();
        for (int i = 0; i < levelSize; i++) {
            TreeNode node = queue.poll();
            System.out.print(node.val + " ");
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        System.out.println(); // new line for next level
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
