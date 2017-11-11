package leetcode.plus1

import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun plusOne() {
    Solution().plusOne(intArrayOf(1, 2, 3, 4))
        .shouldEqual(intArrayOf(1, 2, 3, 5))
    Solution().plusOne(intArrayOf(1, 2, 3, 9))
        .shouldEqual(intArrayOf(1, 2, 4, 0))
    Solution().plusOne(intArrayOf(9, 9, 9, 9))
        .shouldEqual(intArrayOf(1, 0, 0, 0, 0))
  }
}
