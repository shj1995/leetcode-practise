package com.shj.leecode.data.structure;

import java.util.Set;

/**
 * @author shihaojie
 * @since 2020/8/27 下午6:02
 */
public class Tree<T> implements ITree<T> {
    public static <E> Tree<E> of(TreeNode<E> treeNode) {
        Tree<E> tree = new Tree<>();
        tree.setRoot(treeNode);
        return tree;
    }

    @Override
    public ITreeNode<T> setRoot(ITreeNode<T> treeNode) {
        return null;
    }

    @Override
    public ITreeNode<T> getRoot() {
        return null;
    }

    @Override
    public int depth() {
        return 0;
    }

    @Override
    public void clear() {

    }

    @Override
    public int maxWidth() {
        return 0;
    }

    @Override
    public String toString() {

        return super.toString();
    }

}
/*

                1
      ┌──────┬──┼──┬──┐
      2      3  4  5  6
    ┌─┼──┐
    3 4  5

 * ├─┼─┼─┼─┤
 * │ │ │ │ │
 * └─┴─┴─┴─┘
 *
 *  1
 *      1
 *    [1,1]
 *  [1,1]   [1]
 * 111 111 1111
 *
 */
