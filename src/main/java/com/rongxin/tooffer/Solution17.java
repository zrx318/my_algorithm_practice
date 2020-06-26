package com.rongxin.tooffer;

/**
 * 输入两棵二叉树A，B，判断B是不是A的子结构。（ps：我们约定空树不是任意一个树的子结构）
 */
public class Solution17 {
    public boolean HasSubtree(TreeNode root1,TreeNode root2) {
        if (root2 == null || root1 == null) return false;

        return  isSon(root1, root2) || HasSubtree(root1.left,root2) || HasSubtree(root1.right, root2);
    }

    private boolean isSon(TreeNode root, TreeNode root2) {
        if (root2 == null) return true;

        if (root == null ) return false;

        if (root.val != root2.val) return false;

        return isSon(root.left, root2.left) && isSon(root.right, root2.right);
    }
}
