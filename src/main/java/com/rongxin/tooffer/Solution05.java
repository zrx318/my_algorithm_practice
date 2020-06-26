package com.rongxin.tooffer;

import java.util.Stack;

/**
 * 用两个栈来实现一个队列，完成队列的Push和Pop操作。 队列中的元素为int类型。
 **/
public class Solution05 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
        stack1.push(node);
    }

    public int pop() {
        if (stack1.isEmpty()) return -1;

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }

        int out = stack2.pop();

        while(!stack2.isEmpty()) {
            stack1.push(stack2.pop());
        }
        return out;
    }

}
