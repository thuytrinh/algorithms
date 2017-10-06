package leetcode.twosum2

import org.amshove.kluent.shouldContainAll
import org.amshove.kluent.shouldEqualTo
import org.junit.Test
import java.util.*

class SolutionTest {
  @Test
  fun test() {
    Solution().twoSum(intArrayOf(2, 7, 11, 15), 9)
        .shouldContainAll(intArrayOf(1, 2))
    Solution().twoSum(intArrayOf(2, 6, 7, 15), 9)
        .shouldContainAll(intArrayOf(1, 3))
    Solution().twoSum(intArrayOf(2, 3, 6, 7), 9)
        .shouldContainAll(intArrayOf(1, 4))
    Solution().twoSum(intArrayOf(5, 25, 75), 100)
        .shouldContainAll(intArrayOf(2, 3))
  }

  @Test
  fun bs() {
    Arrays.binarySearch(intArrayOf(1, 3), 1, 2, 3)
        .shouldEqualTo(1)
  }
}
