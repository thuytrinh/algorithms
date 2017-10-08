package leetcode.removeduplicates

import org.amshove.kluent.shouldEqual
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun removeDuplicates() {
    intArrayOf(1, 1, 2).let {
      Solution().removeDuplicates(it).shouldEqualTo(2)
      it.shouldEqual(intArrayOf(1, 2, 2))
    }
    intArrayOf(1, 1).let {
      Solution().removeDuplicates(it).shouldEqualTo(1)
      it.shouldEqual(intArrayOf(1, 1))
    }
    intArrayOf(1, 1, 2, 2, 2, 3, 3, 4, 4).let {
      Solution().removeDuplicates(it).shouldEqualTo(intArrayOf(1, 2, 3, 4).size)
      it.shouldEqual(intArrayOf(1, 2, 3, 4, 4, 4, 4, 4, 4))
    }
  }
}
