package leetcode.equaltreepartition

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().checkEqualTree(
        node(5) {
          left = node(10)
          right = node(10) {
            left = node(2)
            right = node(3)
          }
        }
    ).shouldBeTrue()
  }
}
