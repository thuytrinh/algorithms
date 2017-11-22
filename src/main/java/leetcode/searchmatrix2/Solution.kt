package leetcode.searchmatrix2

sealed class Result
object Found : Result()
data class NotFoundYet(val maxIndex: Int) : Result()

/**
 * https://leetcode.com/problems/search-a-2d-matrix-ii/description/
 */
class Solution {
  // a = [7, 8, 11, 15, 15], target = 12
  private fun IntArray.bs(
      left: Int = 0, // left = 3
      right: Int = size - 1, // right = 2
      target: Int // target = 12
  ): Result {
    if (left > right) {
      return NotFoundYet(right)
    }

    val middle = (left + right) / 2 // middle = 3
    val m = this[middle] // m = 15
    return when {
      m == target -> Found // false
      m < target -> bs(middle + 1, right, target) // false
      else -> bs(left, middle - 1, target) // true
    }
  }

  fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
    if (matrix.isEmpty() || matrix.first().isEmpty()) {
      return false
    }

    var rightIndex = matrix.first().size - 1
    matrix.takeWhile { it.first() <= target }
        .forEach {
          val r = it.bs(right = rightIndex, target = target)
          when (r) {
            is Found -> return true
            is NotFoundYet -> rightIndex = r.maxIndex
          }
        }
    return false
  }
}
