package com.rongxin.tooffer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 题目描述
 * 从上到下按层打印二叉树，同一层结点从左至右输出。每一层输出一行。
 *
 */
public class Solution60 {
    ArrayList<ArrayList<Integer>> Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        if (pRoot == null) return res;
        q.add(pRoot);
        while(!q.isEmpty()){
            int size = q.size();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                TreeNode  poll = q.poll();
                list.add(poll.val);
                if (poll.left!=null){
                    q.add(poll.left);
                }
                if (poll.right!=null){
                    q.add(poll.right);
                }
            }
            res.add(list);
        }
        return res;
    }
}
