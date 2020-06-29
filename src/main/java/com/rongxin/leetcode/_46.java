package com.rongxin.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * <p>
 * 示例:
 * <p>
 * 输入: [1,2,3]
 * 输出:
 * [
 * [1,2,3],
 * [1,3,2],
 * [2,1,3],
 * [2,3,1],
 * [3,1,2],
 * [3,2,1]
 * ]
 */

public class _46 {
    public static void main(String[] args) {
        _46 s = new _46();
        List<List<Integer>> permute = s.permute(new int[]{1, 2, 3});
        System.out.println(permute.toString());
    }


    ArrayList<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        if (nums == null || nums.length <= 0) {
            return res;
        }
        dfs(nums, 0, new ArrayList<Integer>(), new boolean[nums.length]);
        return res;
    }

    private void dfs(int[] nums, int index, ArrayList<Integer> list, boolean[] flag) {
        if (index >= nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!flag[i]) {
                flag[i] = true;
                list.add(nums[i]);
                dfs(nums, index + 1, list, flag);
                flag[i] = false;
                list.remove(list.size() - 1);
            }
        }
    }
}
