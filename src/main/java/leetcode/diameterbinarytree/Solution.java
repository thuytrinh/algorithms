package leetcode.diameterbinarytree;

import leetcode.binarytreeboundary.TreeNode;

import java.util.HashMap;
import java.util.Map;

import static java.lang.Math.max;

/**
 * https://leetcode.com/problems/diameter-of-binary-tree/description/
 */
public class Solution {
  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }
    Map<TreeNode, Integer> maxLenCache = new HashMap<>();
    calculateMaxLen(root, maxLenCache);
    return calculateDiameterLen(root, maxLenCache);
  }

  private void calculateMaxLen(
      TreeNode node,
      Map<TreeNode, Integer> maxLenCache) {
    if (node == null) {
      return;
    }

    int additionalEdge = 0;
    int leftMaxLen = 0;
    int rightMaxLen = 0;
    if (node.left != null) {
      calculateMaxLen(node.left, maxLenCache);
      leftMaxLen = maxLenCache.get(node.left);
      additionalEdge = 1;
    }
    if (node.right != null) {
      calculateMaxLen(node.right, maxLenCache);
      rightMaxLen = maxLenCache.get(node.right);
      additionalEdge = 1;
    }
    int maxLen = additionalEdge + max(leftMaxLen, rightMaxLen);
    maxLenCache.put(node, maxLen);
  }

  private int calculateDiameterLen(
      TreeNode node,
      final Map<TreeNode, Integer> maxLenCache) {
    int rootDiameterLen = 0;
    int leftDiameterLen = 0;
    int rightDiameterLen = 0;
    if (node.left != null) {
      leftDiameterLen = calculateDiameterLen(node.left, maxLenCache);
      rootDiameterLen += 1 + maxLenCache.get(node.left);
    }
    if (node.right != null) {
      rightDiameterLen = calculateDiameterLen(node.right, maxLenCache);
      rootDiameterLen += 1 + maxLenCache.get(node.right);
    }
    return max(rootDiameterLen, max(leftDiameterLen, rightDiameterLen));
  }
}
