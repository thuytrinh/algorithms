package leetcode.groupanagrams

import org.amshove.kluent.shouldContainAll
import org.junit.Test

class SolutionTest {
  @Test
  fun groupAnagrams() {
    Solution().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))
        .shouldContainAll(listOf(
            listOf("ate", "eat", "tea"),
            listOf("nat", "tan"),
            listOf("bat")
        ))
  }
}
