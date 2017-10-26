package leetcode.findcelebrity

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  @Throws(Exception::class)
  fun findCelebrity0() {
    checkCele(1)
    checkCele(2)
    checkCele(3)
    checkCele(4)
    checkCele(5)
  }

  private fun checkCele(cele: Int) {
    val s = Solution()
    s.knowPredicate = { x, y -> if (x == cele) false else y == cele }
    s.findCelebrity(10000).shouldEqualTo(cele)
  }
}
