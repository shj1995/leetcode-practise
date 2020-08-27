package com.shj.leecode.data.structure;

/**
 * @author shihaojie
 * @since 2020/8/27 下午5:32
 */
public interface ITree<T> {
    ITreeNode<T> setRoot(ITreeNode<T> treeNode);

    ITreeNode<T> getRoot();

    int depth();

    void clear();

    int maxWidth();
}
