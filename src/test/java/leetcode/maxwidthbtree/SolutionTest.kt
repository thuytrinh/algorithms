package leetcode.maxwidthbtree

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().widthOfBinaryTree(
        node(1) {
          left = node(3) {
            left = node(5)
            right = node(3)
          }
        }
    ).shouldEqualTo(2)

    Solution().widthOfBinaryTree(
        node(1) {
          left = node(3) {
            right = node(3)
          }
        }
    ).shouldEqualTo(1)

    Solution().widthOfBinaryTree(
        node(1) {
          left = node(3) {
            left = node(5)
            right = node(3)
          }
          right = node(2) {
            right = node(9)
          }
        }
    ).shouldEqualTo(4)


    Solution().widthOfBinaryTree(
        node(1) {
          left = node(3) {
            left = node(5)
            right = node(3)
          }
          right = node(2)
        }
    ).shouldEqualTo(2)
  }
}
