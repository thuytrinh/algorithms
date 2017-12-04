package leetcode.lettercombinations

import org.amshove.kluent.shouldBeEmpty
import org.amshove.kluent.shouldContainAll
import org.junit.Test

class SolutionTest {
  @Test
  fun letterCombinations() {
    Solution()
        .letterCombinations("23")
        .shouldContainAll(listOf(
            "ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"
        ))
    Solution()
        .letterCombinations("01")
        .shouldBeEmpty()
  }
}
