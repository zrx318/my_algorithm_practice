package com.rongxin.tooffer;

import java.util.ArrayList;

/**
 * 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 */

public class Solution03 {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> res = new ArrayList<>();

        while(listNode != null) {
            res.add(0,listNode.val);
            listNode = listNode.next;
        }
        return res;
    }

}

