package leetcode.merge2btrees;

import leetcode.binarytreeboundary.TreeNode;

/**
 * https://leetcode.com/problems/merge-two-binary-trees/description/
 */
public class Solution {
  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
    if (t1 == null && t2 != null) {
      return t2;
    } else if (t1 != null && t2 == null) {
      return t1;
    }

    recursivelyMergeTrees(t1, t2);
    return t1;
  }

  private void recursivelyMergeTrees(final TreeNode t1, final TreeNode t2) {
    if (t1 != null && t2 != null) {
      // To merge left sub-tree.
      if (t1.left == null) {
        t1.left = t2.left;
      } else {
        recursivelyMergeTrees(t1.left, t2.left);
      }

      // To merge root.
      t1.val += t2.val;

      // To merge right sub-tree.
      if (t1.right == null) {
        t1.right = t2.right;
      } else {
        recursivelyMergeTrees(t1.right, t2.right);
      }
    }
  }
}
