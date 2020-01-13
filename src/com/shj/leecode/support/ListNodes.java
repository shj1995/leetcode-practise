package com.shj.leecode.support;

public class ListNodes {
    public static ListNode newListNode(int... vals) {
        if(vals.length == 0) {
            return null;
        }
        if(vals.length == 1) {
            return new ListNode(vals[0]);
        }
        ListNode instance = new ListNode(vals[0]);
        setNext(vals,1, instance);
        return instance;
    }

    public static void setNext(int[] vals,int index, ListNode pre){

        // recursion terminator 终止条件
        if (vals.length == index) {
            return;
        }

        // process logic in current level 当前层级的处理逻辑
        ListNode cur = new ListNode(vals[index]);
        pre.next = cur;
        // drill down 下一层处理
        setNext(vals, ++index, cur);
        // reverse the current level stattus if needed 如有必要，反转当前级别状态

    }
}
