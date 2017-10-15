package leetcode.averagelevelsbtree

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun averageOfLevels() {
    Solution().averageOfLevels(
        node(3) {
          left = node(9)
          right = node(20) {
            left = node(15)
            right = node(7)
          }
        }
    ).shouldEqual(listOf(3.0, 14.5, 11.0))
  }
}
