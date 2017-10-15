package leetcode.mergesortedarray

import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SolutionTest {
  @Test
  fun merge0() {
    val nums1 = intArrayOf(0, 2, 4, 6, -1, -1, -1)
    Solution().merge(
        nums1,
        4,
        intArrayOf(1, 3, 5),
        3
    )
    assertThat(nums1).isEqualTo(intArrayOf(0, 1, 2, 3, 4, 5, 6))
  }

  @Test
  fun merge1() {
    val nums1 = intArrayOf(0, -1)
    Solution().merge(
        nums1,
        1,
        intArrayOf(1),
        1
    )
    assertThat(nums1).isEqualTo(intArrayOf(0, 1))
  }
}
