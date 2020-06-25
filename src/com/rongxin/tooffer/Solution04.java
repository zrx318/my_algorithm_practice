package com.rongxin.tooffer;

import java.util.Arrays;

/**
 * 输入某二叉树的前序遍历和中序遍历的结果，
 * 请重建出该二叉树。
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * 例如输入前序遍历序列{1,2,4,7,3,5,6,8}和中序遍历序列{4,7,2,1,5,3,8,6}，则重建二叉树并返回。
 */

public class Solution04 {

    /**
     * 采用递归方式，假设现在就是最后一个节点了，我如何处理，left? right?
     */
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || pre.length == 0) return null;
        if (pre.length > 1) {
            int findIndex = 0;
            for (int i = 0; i < pre.length; i++) {
                if (pre[0] == in[i]) {
                    findIndex = i;
                    break;
                }
            }
            int[] pre1 = Arrays.copyOfRange(pre,1, findIndex + 1);
            int[] pre2 = Arrays.copyOfRange(pre, findIndex + 1, pre.length);

            int[] in1 = Arrays.copyOfRange(in,0, findIndex);
            int[] in2 = Arrays.copyOfRange(in,findIndex + 1, in.length);

            TreeNode root = new TreeNode(pre[0]);
            root.left = reConstructBinaryTree(pre1, in1);
            root.right = reConstructBinaryTree(pre2, in2);
            return root;
        } else {
            return new TreeNode(pre[0]);
        }
    }
}
