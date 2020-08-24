package com.shj.leecode;

import com.shj.leecode.support.TreeNode;

/**
 * 给定一个二叉树，找出其最小深度。
 *
 * 最小深度是从根节点到最近叶子节点的最短路径上的节点数量。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回它的最小深度  2.
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/minimum-depth-of-binary-tree
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author shj 2020/5/6 下午4:04
 */
public class Solution111 {

    public static void main(String[] args) {

        Solution111 solution = new Solution111();
        TreeNode root = new TreeNode(3);
        TreeNode node9 = new TreeNode(9);
        TreeNode node20 = new TreeNode(20);
        TreeNode node15 = new TreeNode(15);
        TreeNode node7 = new TreeNode(7);

        root.left = new TreeNode(9);
        root.right = node9;
        node20.left =  node15;
        node20.right = node7;
        System.out.println("给定二叉树");
        minDepth(root);
    }

    public static int minDepth(TreeNode root) {
        return 0;
    }


}
