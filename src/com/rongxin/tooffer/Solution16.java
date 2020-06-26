package com.rongxin.tooffer;


/**
 * 输入两个单调递增的链表，输出两个链表合成后的链表，当然我们需要合成后的链表满足单调不减规则。
 */
public class Solution16 {
    //遍历方式
    public ListNode Merge1(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode node = list1.val <= list2.val ? list1 : list2;
        if (node == list1) {
            list1 = list1.next;
        } else {
            list2 = list2.next;
        }
        ListNode temp = node;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
                temp = temp.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
                temp = temp.next;
            }
        }

        while (list1 != null) {
            temp.next = list1;
            list1 = list1.next;
            temp = temp.next;
        }
        while (list2!= null) {
            temp.next = list2;
            list2 = list2.next;
            temp = temp.next;
        }

        return node;
    }

    //递归方式
    public ListNode Merge(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode node;
        if (list1.val <= list2.val) {
            list1.next = Merge(list1.next, list2);
            return  list1;
        } else {
            list2.next = Merge(list1, list2.next);
            return  list2;
        }
    }
}
