package com.rongxin.tooffer;

/**
 * 输入一个链表，反转链表后，输出新链表的表头。
 */
public class Solution15 {

    public ListNode ReverseList(ListNode head) {

        ListNode pre = null;
        ListNode next;
        ListNode cur = head;

        while(cur != null){
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return  pre;
    }
}
