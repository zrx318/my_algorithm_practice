package com.rongxin.tooffer;

/**
 * 输入一个链表，输出该链表中倒数第k个结点。
 */
public class Solution14 {
    public ListNode FindKthToTail(ListNode head,int k) {
        ListNode temp = head;

        for (int i = 0; i < k; i++) {
            if (temp == null) return  null;
            temp = temp.next;
        }

        while(temp != null) {
            temp = temp.next;
            head = head.next;
        }
        
        return  head;
    }
}
