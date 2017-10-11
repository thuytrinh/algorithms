package leetcode.kthsmallestbst;

import leetcode.binarytreeboundary.TreeNode;

import java.util.TreeSet;

/**
 * https://leetcode.com/problems/kth-smallest-element-in-a-bst/description/
 */
public class Solution {
  public int kthSmallest(TreeNode root, int k) {
    final TreeSet<Integer> minSet = new TreeSet<>();
    travel(root, minSet, k);
    return minSet.last();
  }

  private boolean travel(
      final TreeNode root,
      final TreeSet<Integer> minSet,
      final int k) {
    boolean shouldContinueToTravel = true;
    if (root.left != null) {
      shouldContinueToTravel = travel(root.left, minSet, k);
    }
    if (shouldContinueToTravel) {
      minSet.add(root.val);
      if (minSet.size() == k) {
        return false;
      }
    }
    if (shouldContinueToTravel && root.right != null) {
      shouldContinueToTravel = travel(root.right, minSet, k);
    }
    return shouldContinueToTravel;
  }
}
