package leetcode.move0s

import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun moveZeroes0() {
    val a = intArrayOf(0, 1, 2)
    Solution().moveZeroes(a)
    a.shouldEqual(intArrayOf(1, 2, 0))
  }

  @Test
  fun moveZeroes1() {
    val a = intArrayOf(0, 1, 0, 2, 0, 3)
    Solution().moveZeroes(a)
    a.shouldEqual(intArrayOf(1, 2, 3, 0, 0, 0))
  }

  @Test
  fun moveZeroes2() {
    val a = intArrayOf(0, 0, 1)
    Solution().moveZeroes(a)
    a.shouldEqual(intArrayOf(1, 0, 0))
  }

  @Test
  fun moveZeroes3() {
    val a = intArrayOf(0, 0, 0, 0)
    Solution().moveZeroes(a)
    a.shouldEqual(intArrayOf(0, 0, 0, 0))
  }
}
