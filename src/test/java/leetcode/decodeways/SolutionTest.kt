package leetcode.decodeways

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun decodeWays() {
    Solution().numDecodings("0").shouldEqualTo(0)
    Solution().numDecodings("").shouldEqualTo(0)
    Solution().numDecodings("2").shouldEqualTo(1)
    Solution().numDecodings("12").shouldEqualTo(2)
    Solution().numDecodings("123").shouldEqualTo(3)
    Solution().numDecodings("1234").shouldEqualTo(3)
    Solution().numDecodings("150").shouldEqualTo(0)
    Solution().numDecodings("20").shouldEqualTo(1)
    Solution().numDecodings("50").shouldEqualTo(0)
  }
}
