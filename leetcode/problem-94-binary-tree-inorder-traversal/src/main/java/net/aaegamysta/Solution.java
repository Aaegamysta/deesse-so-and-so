package net.aaegamysta;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        var list = new ArrayList<Integer>();
        traverse(list, root);
        return list;
    }
    public void traverse(List<Integer> list, TreeNode node) {
        if(node == null) {
            return;
        }
        traverse(list, node.left);
        list.add(node.val);
        traverse(list, node.right);

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