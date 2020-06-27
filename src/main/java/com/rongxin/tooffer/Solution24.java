package com.rongxin.tooffer;

import java.util.ArrayList;

/**
 * @ClassName Solution24
 * @Author RX_Zhao
 * @Date 14:36
 * <p>
 * 输入一颗二叉树的根节点和一个整数，
 * 按字典序打印出二叉树中结点值的和为输入整数的所有路径。
 * 路径定义为从树的根结点开始往下一直到叶结点所经过的结点形成一条路径。
 **/
public class Solution24 {
    ArrayList<ArrayList<Integer>> res = new ArrayList<>();
    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        dfs(root, target, new ArrayList<Integer>());

        return res;
    }

    private void dfs(TreeNode root, int target, ArrayList<Integer> list) {
        if (root == null && target == 0) {
            if (!res.contains(list) && !list.isEmpty()){
                res.add(list);
            }
            return;
        }
        if (root == null || target <= 0) return;
        list.add(root.val);
        dfs(root.left, target - root.val, new ArrayList<>(list));
        dfs(root.right, target - root.val, new ArrayList<>(list));
    }
}
