package leetcode.intersection2linkedlists

import org.amshove.kluent.shouldBe
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    val c = ListNode(2).apply {
      next = ListNode(3).apply {
        next = ListNode(4)
      }
    }
    val a = ListNode(1).apply {
      next = ListNode(2).apply {
        next = c
      }
    }
    val b = ListNode(1).apply {
      next = ListNode(2).apply {
        next = ListNode(3).apply {
          next = c
        }
      }
    }
    Solution().getIntersectionNode(a, b)
        .shouldBe(c)
  }
}