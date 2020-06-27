package com.rongxin.tooffer;

import java.util.Stack;

/**
 * @ClassName _Solution21
 * @Author RX_Zhao
 * @Date 13:34
 *
 *
 * 输入两个整数序列，第一个序列表示栈的压入顺序，
 * 请判断第二个序列是否可能为该栈的弹出顺序。
 * 假设压入栈的所有数字均不相等。
 * 例如序列1,2,3,4,5是某栈的压入顺序，
 * 序列4,5,3,2,1是该压栈序列对应的一个弹出序列，
 * 但4,3,5,1,2就不可能是该压栈序列的弹出序列。
 * （注意：这两个序列的长度是相等的）
 **/
public class _Solution21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
        Stack<Integer> stack = new Stack<>();
        int i = 0, j = 0;
        while (i < pushA.length) {
            if (pushA[i] == popA[j]) {
                j++;
                while (!stack.isEmpty() && stack.peek() == popA[j]){
                    stack.pop();
                    j++;
                }
            } else {
                stack.push(pushA[i]);
            }
            i ++;
        }
        return stack.isEmpty();
    }
}
