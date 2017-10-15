package leetcode.averagelevelsbtree;

import leetcode.binarytreeboundary.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/description/
 */
public class Solution {
  public List<Double> averageOfLevels(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    Map<Integer, List<Integer>> levels = new HashMap<>();
    toLevels(root, 0, levels);
    int maxLevel = Collections.max(levels.keySet());
    List<Double> averages = new ArrayList<>();
    for (int i = 0; i <= maxLevel; i++) {
      averages.add(toAverage(levels.get(i)));
    }
    return averages;
  }

  private Double toAverage(final List<Integer> values) {
    double sum = 0;
    for (final int value : values) {
      sum += value;
    }
    return sum / values.size();
  }

  private void toLevels(
      final TreeNode root,
      final int levelValue,
      final Map<Integer, List<Integer>> levels) {
    if (root == null) {
      return;
    }
    List<Integer> level = levels.get(levelValue);
    if (level == null) {
      level = new ArrayList<>();
      levels.put(levelValue, level);
    }
    level.add(root.val);
    toLevels(root.left, levelValue + 1, levels);
    toLevels(root.right, levelValue + 1, levels);
  }
}
