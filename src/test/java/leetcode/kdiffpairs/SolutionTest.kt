package leetcode.kdiffpairs

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().findPairs(intArrayOf(), 2).shouldEqualTo(0)
    Solution().findPairs(intArrayOf(3, 1, 4, 1, 5), 2).shouldEqualTo(2)
    Solution().findPairs(intArrayOf(1, 2, 3, 4, 5), 1).shouldEqualTo(4)
    Solution().findPairs(intArrayOf(1, 3, 1, 5, 4), 0).shouldEqualTo(1)
    Solution().findPairs(intArrayOf(1, 2, 3, 4, 5), -1).shouldEqualTo(0)
  }
}