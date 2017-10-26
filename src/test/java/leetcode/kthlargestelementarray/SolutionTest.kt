package leetcode.kthlargestelementarray

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun findKthLargest() {
    Solution().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2).shouldEqualTo(5)
    Solution().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 1).shouldEqualTo(6)
    Solution().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 6).shouldEqualTo(1)
  }
}