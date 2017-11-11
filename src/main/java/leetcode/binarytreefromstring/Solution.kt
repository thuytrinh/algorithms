package leetcode.binarytreefromstring

import leetcode.binarytreeboundary.TreeNode
import java.util.*

typealias NextIndex = Int
typealias IntValue = Int

class Solution {
  private fun String.nextInt(index: Int): Pair<IntValue, NextIndex> {
    // Ex:
    // index = 1
    // s = "(234)", s(2) = 2.
    // -> (234, 4) with 4 is sum of (index + s.length).
    val s = ((index + 1) until length)
        .map { this[it] }
        .takeWhile { it == '-' || it.isDigit() }
        .joinToString(separator = "")
    return Pair(s.toInt(), index + s.length)
  }

  // node = (3)
  private fun Stack<TreeNode>.addNode(node: TreeNode) {
    when {
      isEmpty() -> push(node)
      peek().left == null -> {
        peek().left = node
        push(node)
      }
      else -> {
        peek().right = node
        push(node)
      }
    }
  }

  // str = "4(2)(3)"
  fun str2tree(str: String): TreeNode? {
    if (str.isEmpty()) {
      return null
    }

    val s = "($str)" // s = "(4(2)(3))"
    val parents = Stack<TreeNode>() // parents = []
    var root: TreeNode? = null      // root = null

    var i = 0
    while (i < s.length) { // i = 9, length = 9
      when (s[i]) {        // s[i] = '('
        '(' -> {
          val p = s.nextInt(i) // p = (3, 6)
          i = p.second         // i = 6
          parents.addNode(TreeNode(p.first)) // parents = [4,3]
        }
        ')' -> root = parents.pop() // root = (4), parents = []
      }
      i++ // i = 9
    }
    return root // root = (4)
  }
}
