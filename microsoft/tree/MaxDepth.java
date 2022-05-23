package tree;

public class MaxDepth {



  //用后续遍历的思想 当node 为空时返回 0 ，不然返回1 ，一层一层从底向上加
  public int maxDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    int leftDepth = maxDepth(root.left);
    int rightDepth = maxDepth(root.right);
    return 1 + Math.max(leftDepth, rightDepth);
  }
}
