package tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePreorderTraversal {
  //Preorder tree , we can use two method , one is dynamic plan , we can get every node's value,
  // another one is Retrospective algorithm, we can get final result
  public List<Integer> preorderTraversal(TreeNode root) {
    List<Integer> result = new ArrayList();
    if (root == null) {
      return result;
    }
    result.add(root.val);
    result.addAll(preorderTraversal(root.left));
    result.addAll(preorderTraversal(root.right));
    return result;
  }
}
