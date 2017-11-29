package leetcode.btverticalordertraversal

import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().verticalOrder(node(3) {
      left = node(9)
      right = node(20) {
        left = node(15)
        right = node(7)
      }
    }).shouldEqual(listOf(
        listOf(9),
        listOf(3, 15),
        listOf(20),
        listOf(7)
    ))

    Solution().verticalOrder(node(3) {
      left = node(9) {
        left = node(4)
        right = node(0)
      }
      right = node(8) {
        left = node(1)
        right = node(7)
      }
    }).shouldEqual(listOf(
        listOf(4),
        listOf(9),
        listOf(3, 0, 1),
        listOf(8),
        listOf(7)
    ))
  }
}
