package net.aaegamysta;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if(p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    void traverseAndPopulateList(List<Integer> list, TreeNode node) {
        if(node == null) {
            list.add(null);
            return;
        }
        list.add(node.val);
        traverseAndPopulateList(list, node.left);
        traverseAndPopulateList(list, node.right);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Node {
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
