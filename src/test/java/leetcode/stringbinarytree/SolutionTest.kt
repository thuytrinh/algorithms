package leetcode.stringbinarytree

import leetcode.stringbinarytree.Solution.TreeNode
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().tree2str(
        TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(4)
          }
          right = TreeNode(3)
        }
    ).shouldEqualTo("1(2(4))(3)")

    Solution().tree2str(
        TreeNode(1).apply {
          left = TreeNode(2).apply {
            right = TreeNode(4)
          }
          right = TreeNode(3)
        }
    ).shouldEqualTo("1(2()(4))(3)")

    Solution().tree2str(TreeNode(1)).shouldEqualTo("1")

    Solution().tree2str(
        TreeNode(1).apply {
          left = TreeNode(2)
          right = TreeNode(3)
        }
    ).shouldEqualTo("1(2)(3)")

    Solution().tree2str(
        TreeNode(1).apply {
          right = TreeNode(2).apply {
            right = TreeNode(3)
          }
        }
    ).shouldEqualTo("1()(2()(3))")

    Solution().tree2str(
        TreeNode(1).apply {
          left = TreeNode(2).apply {
            left = TreeNode(3)
          }
        }
    ).shouldEqualTo("1(2(3))")
  }
}
