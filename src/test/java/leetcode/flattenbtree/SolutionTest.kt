package leetcode.flattenbtree

import leetcode.binarytreeboundary.isEqualTo
import leetcode.binarytreeboundary.node
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun case0() {
    val root = node(1) {
      left = node(2) {
        left = node(3)
        right = node(4)
      }
      right = node(5) {
        right = node(6)
      }
    }
    Solution().flatten(root)
    root.isEqualTo(node(1) {
      right = node(2) {
        right = node(3) {
          right = node(4) {
            right = node(5) {
              right = node(6)
            }
          }
        }
      }
    }).shouldBeTrue()
  }

  @Test
  fun case1() {
    val root = node(1) {
      left = node(2)
    }
    Solution().flatten(root)
    root.isEqualTo(node(1) {
      right = node(2)
    }).shouldBeTrue()
  }
}
