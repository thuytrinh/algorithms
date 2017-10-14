package leetcode.sqrt

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SolutionTest {
  @Test
  fun sqrt0() {
    val begin = Int.MAX_VALUE - 2
    (begin..Int.MAX_VALUE).forEach {
      val expected = Math.sqrt(it.toDouble()).toInt()
      assertThat(Solution().mySqrt(it))
          .describedAs("mySqrt($it)")
          .isEqualTo(expected)
    }
  }
}
