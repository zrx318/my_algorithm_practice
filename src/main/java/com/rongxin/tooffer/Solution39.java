package com.rongxin.tooffer;

/**
 * 输入一棵二叉树，判断该二叉树是否是平衡二叉树。
 * <p>
 * 在这里，我们只需要考虑其平衡性，不需要考虑其是不是排序二叉树
 */
public class Solution39 {
    public boolean IsBalanced_Solution(TreeNode root) {
        if (root == null) {
            return true;
        }
        return Math.abs(TreeDepth(root.left) - TreeDepth(root.right)) <= 1;
    }

    //题38中的求深度
    public int TreeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        if (root.left == null && root.right == null) {
            return 1;
        }
        return Math.max(TreeDepth(root.left), TreeDepth(root.right)) + 1;
    }
}
