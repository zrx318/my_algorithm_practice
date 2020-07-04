package com.rongxin.tooffer;

import java.util.*;

/**
 * @ClassName Solution59
 * @Author RX_Zhao
 * <p>
 * 请实现一个函数按照之字形打印二叉树，
 * 即第一行按照从左到右的顺序打印，
 * 第二层按照从右至左的顺序打印，
 * 第三行按照从左到右的顺序打印，其他行以此类推。
 **/
public class Solution59 {
    public ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if (pRoot == null) {
            return res;
        }
        Queue<TreeNode> q = new LinkedList<>();
        q.add(pRoot);

        while (!q.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            while (!q.isEmpty()) {
                TreeNode poll = q.poll();
                list.add(poll.val);
                if (poll.left != null) {
                    q.add(poll.left);
                }
                if (poll.right != null) {
                    q.add(poll.right);
                }
            }
        }
        return res;
    }
}
