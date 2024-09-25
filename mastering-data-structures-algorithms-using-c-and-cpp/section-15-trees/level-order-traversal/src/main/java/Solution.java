import java.util.LinkedList;
import java.util.Queue;

public class Solution {
   public void levelOrderTraversal(TreeNode root) {
       Queue<TreeNode> queue = new LinkedList<>();
       queue.add(root);
       while(!queue.isEmpty()) {
           var node = queue.poll();
           System.out.println(node.val);
           if(node.left != null) {
               queue.add(node);
           }
           if(node.right != null) {
               queue.add(node);
           }
       }
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