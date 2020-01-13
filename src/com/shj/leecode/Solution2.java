package com.shj.leecode;

import com.shj.leecode.support.ListNode;
import com.shj.leecode.support.ListNodes;

/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-two-numbers
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Solution2 {
    public static void main(String[] args) {
        Solution2 solution2 = new Solution2();
        ListNode l1 = ListNodes.newListNode(2,4,3);
        ListNode l2 = ListNodes.newListNode(5,6,4);
        System.out.println(String.format("输入：(%s)+(%s)",toString(l1),toString(l2)));
        ListNode sum = solution2.addTwoNumbers(l1,l2);
        System.out.println("输出："+toString(sum));
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return null;
    }


    public static String toString(ListNode node) {
        StringBuilder result = new StringBuilder();
        result.append(node.val + "->");
        ListNode current = node.next;
        while (current != null) {
            result.append(current.val + "->");
            current = current.next;
        }
        return result.toString();
    }
}
