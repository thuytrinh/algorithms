package leetcode.searchrotatedsortedarray

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun search() {
    Solution().search(intArrayOf(4, 5, 6, 7, 0, 1, 2), 0).shouldEqualTo(4)
    Solution().search(intArrayOf(0, 1, 2, 3, 4, 5, 6), 4).shouldEqualTo(4)
  }
}