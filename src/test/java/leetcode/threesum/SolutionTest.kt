package leetcode.threesum

import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldContainAll
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().threeSum(intArrayOf(-1, 0, 1, 2, -1, -4))
        .shouldContainAll(listOf(
            listOf(-1, 0, 1),
            listOf(-1, -1, 2)
        ))
    Solution().threeSum(intArrayOf())
        .shouldBeEmpty()
  }
}
