package com.rongxin.tooffer;

/**
 * @ClassName __Solution56
 * @Author RX_Zhao
 * <p>
 * 题目描述
 * 在一个排序的链表中，存在重复的结点，
 * 请删除该链表中重复的结点，重
 * 复的结点不保留，返回链表头指针。
 * 例如，链表1->2->3->3->4->4->5 处理后为 1->2->5
 **/
public class __Solution56 {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.next == null){
            return pHead;
        }
        if (pHead.val != pHead.next.val){
            pHead.next = deleteDuplication(pHead.next);
            return pHead;
        }else {
            ListNode head = pHead.next;
            while (head != null && head.val == pHead.val){
                head = head.next;
            }
            return deleteDuplication(head);
        }
    }

}
