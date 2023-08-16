package com.engineering.gfgcontest.contest115;

final class TreeNode {
    TreeNode left;
    TreeNode right;
    int value;

    TreeNode(int value) {
        this.value = value;
    }
}

public class LowestCommonAncestor {
    public static void main(String[] args) {
    }

    public TreeNode findLowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }

        TreeNode left = findLowestCommonAncestor(root.left, p, q);
        TreeNode right = findLowestCommonAncestor(root.right, p, q);

        if (left == null) {
            return right;
        }
        else if (right == null) {
            return left;
        }
        else {
            return root;
        }
    }
}
