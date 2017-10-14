package leetcode.strstr

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun strStr() {
    Solution().strStr("I shall pass Facebook!", "pass")
        .shouldEqualTo(8)
    Solution().strStr("pass", "I shall pass Facebook!")
        .shouldEqualTo(-1)
  }
}
