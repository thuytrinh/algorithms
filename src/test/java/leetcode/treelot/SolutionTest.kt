package leetcode.treelot

import leetcode.binarytreeboundary.TreeNode
import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    val tree = TreeNode(3).apply {
      left = TreeNode(9)
      right = TreeNode(20).apply {
        left = TreeNode(15)
        right = TreeNode(7)
      }
    }
    Solution().levelOrder(tree).shouldEqual(listOf(
        listOf(3),
        listOf(9, 20),
        listOf(15, 7)
    ))

    Solution().levelOrder(TreeNode(3)).shouldEqual(listOf(listOf(3)))
  }
}
