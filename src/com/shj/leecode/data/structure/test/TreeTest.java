package com.shj.leecode.data.structure.test;

import com.shj.leecode.data.structure.Tree;
import com.shj.leecode.data.structure.TreeNode;

/**
 * @author shihaojie
 * @since 2020/8/27 下午6:01
 */
public class TreeTest {
    public static void main(String[] args) {
        TreeNode<String> treeNode = new TreeNode<>("A");
        treeNode.addChild("B");
        treeNode.addChild("C");
        treeNode.addChild("D");
        treeNode.getLeftChild().addChild("AAA");
        Tree<String> tree = Tree.of(treeNode);
        System.out.println(tree.toString());
    }
}
