package _DSA.Trees.BinaryTreeTraversal;

import java.util.ArrayList;
import java.util.List;

public class BasicTraversals {

    static class TreeNode {

        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public List<Integer> postorderTraversal(TreeNode root) {

        List<Integer> lst = new ArrayList<>();

        if (root == null) {
            return lst;
        }
        lst.addAll(postorderTraversal(root.left));
        lst.addAll(postorderTraversal(root.right));
        lst.add(root.val);

        return lst;

    }

    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        result.add(root.val);
        result.addAll(preorderTraversal(root.left));
        result.addAll(preorderTraversal(root.right));

        return result;

    }

    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> lst = new ArrayList<>();
        if (root == null) {
            return lst;
        }

        lst.addAll(inorderTraversal(root.left));
        lst.add(root.val);
        lst.addAll(inorderTraversal(root.right));

        return lst;

    }

}
