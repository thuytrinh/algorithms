package leetcode.kthsmallestbst

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun kthSmallest() {
    Solution().kthSmallest(
        node(1) {
          right = node(2) {
            right = node(3)
          }
        },
        2
    ).shouldEqualTo(2)
    Solution().kthSmallest(
        node(2) {
          left = node(1)
        },
        1
    ).shouldEqualTo(1)
  }
}