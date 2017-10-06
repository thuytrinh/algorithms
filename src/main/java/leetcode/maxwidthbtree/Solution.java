package leetcode.maxwidthbtree;

import leetcode.binarytreeboundary.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/maximum-width-of-binary-tree/description/
 */
public class Solution {
  public int widthOfBinaryTree(TreeNode root) {
    if (root == null) {
      return 0;
    }

    Map<Integer, List<TreeNode>> levelCache = new HashMap<>();
    Map<TreeNode, Integer> xCache = new HashMap<>();
    travel(root, 0, 1, levelCache, xCache);
    return findMaxWidth(levelCache, xCache);
  }

  private int findMaxWidth(
      final Map<Integer, List<TreeNode>> levelCache,
      final Map<TreeNode, Integer> xCache) {
    int maxWidth = 1;
    for (final List<TreeNode> nodes : levelCache.values()) {
      if (nodes.size() > 1) {
        final Integer leftMostValue = xCache.get(nodes.get(0));
        final Integer rightMostValue = xCache.get(nodes.get(nodes.size() - 1));
        int width = (rightMostValue - leftMostValue) + 1;
        maxWidth = Math.max(width, maxWidth);
      }
    }
    return maxWidth;
  }

  private void travel(
      final TreeNode root,
      final int level,
      final int x,
      final Map<Integer, List<TreeNode>> levelCache,
      final Map<TreeNode, Integer> xCache) {
    if (root == null) {
      return;
    }

    List<TreeNode> nodes = levelCache.get(level);
    if (nodes == null) {
      nodes = new ArrayList<>();
      levelCache.put(level, nodes);
    }
    nodes.add(root);
    xCache.put(root, x);

    travel(root.left, level + 1, x + x - 1, levelCache, xCache);
    travel(root.right, level + 1, x + x, levelCache, xCache);
  }
}
