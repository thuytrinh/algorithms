package leetcode.merge2btrees

import leetcode.binarytreeboundary.isEqualTo
import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().mergeTrees(
        node(1) {
          left = node(3) {
            left = node(5)
          }
          right = node(2)
        },
        node(2) {
          left = node(1) {
            right = node(4)
          }
          right = node(3) {
            right = node(7)
          }
        }
    ).isEqualTo(
        node(3) {
          left = node(4) {
            left = node(5)
            right = node(4)
          }
          right = node(5) {
            right = node(7)
          }
        }
    ).shouldBeTrue()
  }
}
