package leetcode.reverselinkedlist

import leetcode.intersection2linkedlists.isEqualTo
import leetcode.intersection2linkedlists.listNode
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun reverseList() {
    Solution().reverseList(listNode(1) {
      next = listNode(2) {
        next = listNode(3) {
          next = listNode(4)
        }
      }
    }
    ).isEqualTo(listNode(4) {
      next = listNode(3) {
        next = listNode(2) {
          next = listNode(1)
        }
      }
    }).shouldBeTrue()

    Solution().reverseList(listNode(1) {
      next = listNode(2)
    }
    ).isEqualTo(listNode(2) {
      next = listNode(1)
    }).shouldBeTrue()
  }
}
