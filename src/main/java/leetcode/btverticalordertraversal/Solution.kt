package leetcode.btverticalordertraversal

import leetcode.binarytreeboundary.TreeNode
import java.util.*

/**
 * https://leetcode.com/problems/binary-tree-vertical-order-traversal/description/
 */
class Solution {
  fun verticalOrder(root: TreeNode?): List<List<Int>> = when {
    root != null -> {
      val m = root.travelVertically()
      m.keys.sorted()
          .map { m[it] ?: mutableListOf() }
    }
    else -> emptyList()
  }

  private fun TreeNode.travelVertically(): MutableMap<Int, MutableList<Int>> {
    val map = mutableMapOf<Int, MutableList<Int>>()
    val xCache = mutableMapOf(this to 0)
    val nodes = LinkedList<TreeNode>()
    nodes.offer(this)
    while (nodes.isNotEmpty()) {
      val node = nodes.poll()
      val x = xCache[node] ?: 0
      map.getOrPut(x) { mutableListOf() }.add(node.`val`)
      node.left?.let {
        nodes.offer(it)
        xCache[it] = x - 1
      }
      node.right?.let {
        nodes.offer(it)
        xCache[it] = x + 1
      }
    }
    return map
  }
}
