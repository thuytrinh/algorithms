package leetcode.firstuniquechar

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().firstUniqChar("").shouldEqualTo(-1)
    Solution().firstUniqChar("leetcode").shouldEqualTo(0)
    Solution().firstUniqChar("loveleetcode").shouldEqualTo(2)
  }
}
