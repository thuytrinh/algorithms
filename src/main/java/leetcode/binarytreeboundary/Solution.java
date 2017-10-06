package leetcode.binarytreeboundary;

import java.util.*;

/**
 * https://leetcode.com/problems/boundary-of-binary-tree/description/
 */
public class Solution {
  public List<Integer> boundaryOfBinaryTree(TreeNode root) {
    if (root == null) {
      return Collections.emptyList();
    }

    Set<TreeNode> boundarySet = new LinkedHashSet<>();

    // 1
    //  \
    //   2
    //  / \
    // 3   4
    // Left boundary: [1]
    // Leaves: [3,4]
    // Right boundary: [1,2,4]
    // Boundary set: [1,3,4,2]

    //     ____1___
    //    /        \
    //   2          3
    //  / \        /
    // 4   5      6
    //    / \    / \
    //   7   8   9 10
    // Left boundary: [1,2,4]
    // Leaves: [4,7,8,9,10]
    // Right boundary: [1,3,6,10]
    // Boundary set: [1,2,4,7,8,9,10,6,3]

    List<TreeNode> leftBoundary = new ArrayList<>();
    if (root.left == null) {
      leftBoundary.add(root);
    } else {
      collectLeftBoundary(root, leftBoundary);
    }

    List<TreeNode> leaves = new ArrayList<>();
    collectLeaves(root, leaves);

    List<TreeNode> rightBoundary = new ArrayList<>();
    if (root.right == null) {
      rightBoundary.add(root);
    } else {
      collectRightBoundary(root, rightBoundary);
    }

    toBoundarySet(leftBoundary, boundarySet, false);
    toBoundarySet(leaves, boundarySet, false);
    toBoundarySet(rightBoundary, boundarySet, true);

    List<Integer> values = new ArrayList<>();
    toValues(boundarySet, values);
    return values;
  }

  private void toValues(
      final Set<TreeNode> boundarySet,
      final List<Integer> values) {
    for (TreeNode node : boundarySet) {
      values.add(node.val);
    }
  }

  private void toBoundarySet(
      final List<TreeNode> nodes,
      final Set<TreeNode> boundarySet,
      final boolean reverse) {
    if (!reverse) {
      boundarySet.addAll(nodes);
    } else {
      for (int i = nodes.size() - 1; i >= 0; i--) {
        boundarySet.add(nodes.get(i));
      }
    }
  }

  private void collectRightBoundary(
      final TreeNode root,
      final List<TreeNode> rightBoundary) {
    rightBoundary.add(root);
    if (root.right != null) {
      collectRightBoundary(root.right, rightBoundary);
    } else if (root.left != null) {
      collectRightBoundary(root.left, rightBoundary);
    }
  }

  private void collectLeaves(
      final TreeNode root,
      final List<TreeNode> leaves) {
    if (root.left == null && root.right == null) {
      leaves.add(root);
    }
    if (root.left != null) {
      collectLeaves(root.left, leaves);
    }
    if (root.right != null) {
      collectLeaves(root.right, leaves);
    }
  }

  private void collectLeftBoundary(
      final TreeNode root,
      final List<TreeNode> leftBoundary) {
    leftBoundary.add(root);
    if (root.left != null) {
      collectLeftBoundary(root.left, leftBoundary);
    } else if (root.right != null) {
      collectLeftBoundary(root.right, leftBoundary);
    }
  }
}
