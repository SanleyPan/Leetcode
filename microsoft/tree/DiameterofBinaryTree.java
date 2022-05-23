package tree;

public class DiameterofBinaryTree {
  int maxDiameter = 0;
  public int diameterOfBinaryTree(TreeNode root) {
    traverse(root);
    return maxDiameter;
  }
  public int traverse(TreeNode node){
    if(node == null){
      return 0;
    }
    int maxLeft = traverse(node.left);
    int maxRight = traverse(node.right);
    maxDiameter = Math.max(maxDiameter ,maxLeft + maxRight);
    return 1 + Math.max(maxLeft,maxRight);
  }
  //pretty same with MaxDepth;
}
