package leetcode.thirdmaxnumber

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().thirdMax(intArrayOf(3, 2, 1)).shouldEqualTo(1)
    Solution().thirdMax(intArrayOf(1, 2)).shouldEqualTo(2)
    Solution().thirdMax(intArrayOf(2)).shouldEqualTo(2)
    Solution().thirdMax(intArrayOf(2, 2, 3, 1)).shouldEqualTo(1)
    Solution().thirdMax(intArrayOf(2, 2, 2, 2)).shouldEqualTo(2)
    Solution().thirdMax(intArrayOf(1, 2, 2, 5, 3, 5)).shouldEqualTo(2)
  }
}
