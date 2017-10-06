package leetcode.reversewords2

import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun case0() {
    val chars = "the sky is blue".toCharArray()
    Solution().reverseWords(chars)
    chars.shouldEqual("blue is sky the".toCharArray())
  }

  @Test
  fun case1() {
    val chars = "awesome".toCharArray()
    Solution().reverseWords(chars)
    chars.shouldEqual("awesome".toCharArray())
  }
}
