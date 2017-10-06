package leetcode.diameterbinarytree

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().diameterOfBinaryTree(
        node(1) {
          left = node(2) {
            left = node(4)
            right = node(5)
          }
          right = node(3)
        }
    ).shouldEqualTo(3)

    // A case which diameter doesn't go through the root.
    Solution().diameterOfBinaryTree(
        node(1) {
          left = node(2) {
            left = node(4) {
              right = node(6)
            }
            right = node(5) {
              left = node(7)
            }
          }
        }
    ).shouldEqualTo(4)
  }
}
