package leetcode.numberislands

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun numIslands() {
    Solution().numIslands(arrayOf(
        charArrayOf('1', '1', '0'),
        charArrayOf('1', '1', '0'),
        charArrayOf('0', '0', '1')
    )).shouldEqualTo(2)

    Solution().numIslands(arrayOf(
        charArrayOf('1', '0', '0', '0'),
        charArrayOf('1', '0', '1', '1'),
        charArrayOf('1', '0', '1', '1')
    )).shouldEqualTo(2)

    Solution().numIslands(arrayOf(
        charArrayOf('1', '1', '1', '1'),
        charArrayOf('0', '0', '0', '1'),
        charArrayOf('1', '0', '0', '1'),
        charArrayOf('0', '0', '1', '1'),
        charArrayOf('0', '0', '0', '1')
    )).shouldEqualTo(2)

    Solution().numIslands(arrayOf(
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('1', '1', '0', '0', '0'),
        charArrayOf('0', '0', '1', '0', '0'),
        charArrayOf('0', '0', '0', '1', '1')
    )).shouldEqualTo(3)
  }
}
