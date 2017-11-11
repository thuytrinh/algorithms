package leetcode.plus1

/**
 * https://leetcode.com/problems/plus-one/description/
 */
class Solution {
  fun plusOne(digits: IntArray): IntArray {
    var carry = 1
    (digits.size - 1 downTo 0).forEach {
      val s: Int = carry + digits[it]
      when (s) {
        10 -> {
          carry = 1
          digits[it] = 0
        }
        else -> {
          carry = 0
          digits[it] = s
        }
      }
    }
    return when (carry) {
      1 -> intArrayOf(1) + digits
      else -> digits
    }
  }
}
