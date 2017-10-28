package leetcode.validpalindrome2

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  @Throws(Exception::class)
  fun validPalindrome() {
    Solution().validPalindrome("").shouldBeTrue()
    Solution().validPalindrome("abca").shouldBeTrue()
    Solution().validPalindrome("abcca").shouldBeTrue()
    Solution().validPalindrome("abcdca").shouldBeTrue()
    Solution().validPalindrome("accba").shouldBeTrue()
    Solution().validPalindrome("abcda").shouldBeFalse()
    Solution().validPalindrome("accacc").shouldBeTrue()
    Solution().validPalindrome("amlcupuu_uupuculma").shouldBeTrue()
    Solution().validPalindrome("acdcacc").shouldBeFalse()
  }

  @Test
  fun testCaseFromLeetCode() {
    Solution()
        .validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga")
        .shouldBeTrue()

    Solution()
        .validPalindrome("ebcbbececabbacecbbcbe")
        .shouldBeTrue()
  }
}
