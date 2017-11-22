package leetcode.searchmatrix2

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun searchMatrix() {
    Solution().searchMatrix(arrayOf(
        intArrayOf(1, 4, 7, 11, 15),
        intArrayOf(2, 5, 8, 12, 19),
        intArrayOf(3, 6, 9, 16, 22),
        intArrayOf(10, 13, 14, 17, 24),
        intArrayOf(18, 21, 23, 26, 30)
    ), target = 5).shouldBeTrue()
    Solution().searchMatrix(arrayOf(
        intArrayOf(3, 5, 9, 9, 14),
        intArrayOf(7, 8, 11, 15, 15),
        intArrayOf(8, 10, 16, 16, 17)
    ), target = 12).shouldBeFalse()
    Solution().searchMatrix(arrayOf(
        intArrayOf(1)
    ), target = 5).shouldBeFalse()
    Solution().searchMatrix(arrayOf(
        intArrayOf(2, 5, 8, 12, 19)
    ), target = 19).shouldBeTrue()
  }
}
