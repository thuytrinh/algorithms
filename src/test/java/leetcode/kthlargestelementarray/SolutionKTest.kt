package leetcode.kthlargestelementarray

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionKTest {
  @Test
  fun findKthLargest() {
    SolutionK().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 2).shouldEqualTo(5)
    SolutionK().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 1).shouldEqualTo(6)
    SolutionK().findKthLargest(intArrayOf(3, 2, 1, 5, 6, 4), 6).shouldEqualTo(1)
  }
}
