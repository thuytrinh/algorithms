package leetcode.validpalindrome

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  @Throws(Exception::class)
  fun isPalindrome() {
    Solution().isPalindrome(",.%^^").shouldBeTrue()
    Solution().isPalindrome("").shouldBeTrue()
    Solution().isPalindrome("A man, a plan, a canal: Panama").shouldBeTrue()
    Solution().isPalindrome("race a car").shouldBeFalse()
  }
}
