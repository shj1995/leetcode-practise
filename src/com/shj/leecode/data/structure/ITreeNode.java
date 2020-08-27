package com.shj.leecode.data.structure;

import java.util.Set;

/**
 * @author shihaojie
 * @since 2020/8/27 下午5:32
 */
public interface ITreeNode<T> {
    ITreeNode<T> getParentNode();
    Set<ITreeNode<T>> getChildren();
    boolean addChild(T child);
    boolean removeChild(T child);
    void clear();
    boolean isLeaf();
    int getDegree();
    ITreeNode<T> getLeftChild();
    ITreeNode<T> getRightSibling();
}
