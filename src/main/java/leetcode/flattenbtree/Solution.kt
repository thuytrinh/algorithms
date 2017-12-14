package leetcode.flattenbtree

import leetcode.binarytreeboundary.TreeNode

/**
 * https://leetcode.com/problems/flatten-binary-tree-to-linked-list/description/
 */
class Solution {
  fun flatten(root: TreeNode?) {
    root?.flatten()
  }

  private fun TreeNode.flatten(): TreeNode? {
    if (left == null && right == null) {
      return this
    }

    val newLeftLeaf = left?.flatten()
    val newRightLeaf = right?.flatten()
    val oldRight = right
    right = left ?: oldRight
    left = null
    newLeftLeaf?.right = oldRight
    return newRightLeaf ?: newLeftLeaf ?: this
  }
}
