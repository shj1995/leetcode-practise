package com.shj.leecode.data.structure;

import java.util.Objects;
import java.util.Set;

/**
 * @author shihaojie
 * @since 2020/8/27 下午6:08
 */
public class TreeNode<T> implements ITreeNode<T> {
    private T data;
    private Set<TreeNode<T>> children;

    public TreeNode() {
    }

    public TreeNode(T data) {
        this.data = data;
    }

    @Override
    public ITreeNode<T> getParentNode() {
        return null;
    }

    @Override
    public Set<ITreeNode<T>> getChildren() {
        return null;
    }

    @Override
    public boolean addChild(T childData) {
        TreeNode<T> childNode = new TreeNode<>(childData);
        return this.children.add(childNode);
    }

    @Override
    public boolean removeChild(T child) {
        return this.children.remove(child);
    }

    @Override
    public void clear() {

    }

    @Override
    public boolean isLeaf() {
        return false;
    }

    @Override
    public int getDegree() {
        return 0;
    }

    @Override
    public ITreeNode<T> getLeftChild() {
        return null;
    }

    @Override
    public ITreeNode<T> getRightSibling() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        TreeNode<T> treeNode = (TreeNode<T>) o;
        return Objects.equals(data, treeNode.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }
}
