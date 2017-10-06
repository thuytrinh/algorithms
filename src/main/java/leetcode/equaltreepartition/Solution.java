package leetcode.equaltreepartition;

import leetcode.binarytreeboundary.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/equal-tree-partition/description/
 */
public class Solution {
  public boolean checkEqualTree(TreeNode root) {
    if (root == null) {
      return false;
    }

    Map<TreeNode, Integer> subTreeSumCache = new HashMap<>();
    int totalSum = sum(root, subTreeSumCache);
    return canPartition(root.left, subTreeSumCache, totalSum) ||
        canPartition(root.right, subTreeSumCache, totalSum);
  }

  private boolean canPartition(
      final TreeNode root,
      final Map<TreeNode, Integer> subTreeSumCache,
      final int totalSum) {
    if (root == null) {
      return false;
    }
    int s = subTreeSumCache.get(root);
    return s * 2 == totalSum ||
        canPartition(root.left, subTreeSumCache, totalSum) ||
        canPartition(root.right, subTreeSumCache, totalSum);
  }

  private int sum(
      final TreeNode root,
      final Map<TreeNode, Integer> subTreeSumCache) {
    int s = root.val;
    if (root.left != null) {
      s += sum(root.left, subTreeSumCache);
    }
    if (root.right != null) {
      s += sum(root.right, subTreeSumCache);
    }
    subTreeSumCache.put(root, s);
    return s;
  }
}
