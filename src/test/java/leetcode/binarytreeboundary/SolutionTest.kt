package leetcode.binarytreeboundary

import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun case0() {
    val tree = TreeNode(1).apply {
      right = TreeNode(2).apply {
        left = TreeNode(3)
        right = TreeNode(4)
      }
    }
    Solution().boundaryOfBinaryTree(tree)
        .shouldEqual(listOf(1, 3, 4, 2))
  }

  @Test
  fun case1() {
    val tree = TreeNode(1).apply {
      left = TreeNode(2).apply {
        left = TreeNode(4)
        right = TreeNode(5).apply {
          left = TreeNode(7)
          right = TreeNode(8)
        }
      }
      right = TreeNode(3).apply {
        left = TreeNode(6).apply {
          left = TreeNode(9)
          right = TreeNode(10)
        }
      }
    }
    Solution().boundaryOfBinaryTree(tree)
        .shouldEqual(listOf(1, 2, 4, 7, 8, 9, 10, 6, 3))
  }

  @Test
  fun case2() {
    val tree = TreeNode(1)
    Solution().boundaryOfBinaryTree(tree)
        .shouldEqual(listOf(1))
  }

  @Test
  fun case3() {
    val tree = TreeNode(1).apply {
      right = TreeNode(2).apply {
        left = TreeNode(2)
        right = TreeNode(4)
      }
    }
    Solution().boundaryOfBinaryTree(tree)
        .shouldEqual(listOf(1, 2, 4, 2))
  }
}
