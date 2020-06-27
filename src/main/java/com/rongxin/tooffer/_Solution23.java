package com.rongxin.tooffer;

/**
 * @ClassName _Solution23
 * @Author RX_Zhao
 * @Date 14:02
 * <p>
 * 输入一个整数数组，
 * 判断该数组是不是某二叉搜索树的后序遍历的结果。如
 * 果是则输出Yes,否则输出No。
 * 假设输入的数组的任意两个数字都互不相同。
 * <p>
 * <p>
 * 1,2,3, 5,6,7, 4
 * 1,2
 **/
public class _Solution23 {
    public static void main(String[] args) {
        System.out.println("_Solution23.main");
    }
    public boolean VerifySquenceOfBST(int[] sequence) {
        if (sequence == null || sequence.length < 1) return false;
        return judge(sequence, 0, sequence.length - 1);
    }

    private boolean judge(int[] sequence, int start, int end) {
        if (start >= end) return true;
        int index = start;
        for (; index < end; index++) {
            if (sequence[index] > sequence[end]) {
                break;
            }
        }
        for (int i = index; i < end; i++) {
            if (sequence[i] < sequence[end]) {
                return false;
            }
        }
        return judge(sequence, start, index - 1) && judge(sequence, index, end - 1);
    }

}
