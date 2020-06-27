package com.rongxin.tooffer;

import java.util.Stack;

/**
 * @Author RX_Zhao
 * @Date 13:19
 *
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈中所含最小元素的min函数（时间复杂度应为O（1））。
 * 注意：保证测试中不会当栈为空的时候，对栈调用pop()或者min()或者top()方法。
 *
 **/
public class Solution20 {
    Stack<Integer> minSta = new Stack<>();
    Stack<Integer> dataSta = new Stack<>();


    public void push(int node) {
        dataSta.push(node);
        if (minSta.isEmpty()){
            minSta.push(node);
        } else {
            minSta.push(minSta.peek() < node ? minSta.peek() : node);
        }
    }

    public void pop() {
        dataSta.pop();
        minSta.pop();
    }

    public int top() {
        return dataSta.peek();
    }

    public int min() {
        if (minSta.isEmpty()) return 0;
        return minSta.peek();
    }

}
