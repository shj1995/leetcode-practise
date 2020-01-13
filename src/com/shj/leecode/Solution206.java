package com.shj.leecode;

import com.shj.leecode.support.ListNode;

import javax.swing.*;
import java.util.LinkedList;

/**
 * 反转一个单链表。
 * <p>
 * 示例:
 * <p>
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/reverse-linked-list
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution206 {

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        System.out.println("输入：" + node1.toString());
        node1 = new Solution206().reverseList(node1);
        System.out.println("输出：" + node1.toString());

    }


    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode current = head;
        ListNode result = new ListNode(current.val);
        ListNode temCurrentResult;
        while (current.next != null) {
            temCurrentResult = result;
            result = new ListNode(current.next.val);
            result.next = temCurrentResult;
            current = current.next;
        }
        return result;
    }

    public String toString(ListNode node) {
        StringBuilder result = new StringBuilder();
        result.append(node.val + "->");
        ListNode current = node.next;
        while (current != null) {
            result.append(current.val + "->");
            current = current.next;
        }
        result.append("NULL");
        return result.toString();
    }

}