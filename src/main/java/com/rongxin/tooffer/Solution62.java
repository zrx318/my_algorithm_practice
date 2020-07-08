package com.rongxin.tooffer;

/**
 *
 * 提示：中序遍历
 * 给定一棵二叉搜索树，请找出其中的第k小的结点。
 * 例如， （5，3，7，2，4，6，8）    中，
 * 按结点数值大小顺序第三小结点的值为4。
 */
public class Solution62 {
    int index = 0;

    TreeNode KthNode(TreeNode pRoot, int k) {
        if (pRoot == null) return pRoot;

        TreeNode treeNode = KthNode(pRoot.left, k);
        if (treeNode != null) return treeNode;

        index++;
        if (k == index) return pRoot;

        treeNode = KthNode(pRoot.right, k);
        if (treeNode != null) return treeNode;

        return null;

    }
}
