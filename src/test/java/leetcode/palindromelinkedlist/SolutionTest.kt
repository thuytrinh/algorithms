package leetcode.palindromelinkedlist

import leetcode.intersection2linkedlists.ListNode
import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().isPalindrome(
        ListNode(1)
    ).shouldBeTrue()

    Solution().isPalindrome(
        ListNode(1).apply {
          next = ListNode(2).apply {
            next = ListNode(1)
          }
        }
    ).shouldBeTrue()

    Solution().isPalindrome(
        ListNode(1).apply {
          next = ListNode(2).apply {
            next = ListNode(3)
          }
        }
    ).shouldBeFalse()

    Solution().isPalindrome(
        ListNode(1).apply {
          next = ListNode(2).apply {
            next = ListNode(2).apply {
              next = ListNode(1)
            }
          }
        }
    ).shouldBeTrue()
  }
}
