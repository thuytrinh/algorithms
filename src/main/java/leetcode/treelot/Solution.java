package leetcode.treelot;

import leetcode.binarytreeboundary.TreeNode;

import java.util.*;

/**
 * https://leetcode.com/problems/binary-tree-level-order-traversal/description/
 */
class Solution {
  public List<List<Integer>> levelOrder(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    //   3
    //  / \
    // 9   20
    //    /  \
    //   15   7
    // Push 3 into a queue: [3]
    // Enqueue 3 from the queue: []
    // Push children of 3 which are 9 and 20 into the queue: [9,20]
    // Enqueue 9 from the queue: [20]
    // 9 has no children.
    // Enqueue 20 from the queue: []
    // Push children of 20 into the queue: [15,7]
    // That's how we're gonna travel level by level.
    // But how do we add nodes on the same level into an own list?
    // How about using a Map having key as node and value as its level?
    // Root has level 0. Its children will have level as its level + 1.
    Map<TreeNode, Integer> levels = new HashMap<>();
    levels.put(root, 0);

    Queue<TreeNode> nodeQueue = new LinkedList<>();
    Map<Integer, List<Integer>> valuesByLevel = new LinkedHashMap<>();
    nodeQueue.add(root);
    while (!nodeQueue.isEmpty()) {
      TreeNode node = nodeQueue.remove();
      int level = levels.get(node);
      addNodeByLevel(valuesByLevel, node, level);

      if (node.left != null) {
        nodeQueue.add(node.left);
        levels.put(node.left, level + 1);
      }
      if (node.right != null) {
        nodeQueue.add(node.right);
        levels.put(node.right, level + 1);
      }
    }
    return new ArrayList<>(valuesByLevel.values());
  }

  private void addNodeByLevel(
      final Map<Integer, List<Integer>> valuesByLevel,
      final TreeNode node,
      final int level) {
    if (valuesByLevel.containsKey(level)) {
      valuesByLevel.get(level).add(node.val);
    } else {
      final List<Integer> values = new LinkedList<>();
      values.add(node.val);
      valuesByLevel.put(level, values);
    }
  }
}
