package leetcode.twosum

import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
        .shouldEqual(intArrayOf(0, 1))
  }
}