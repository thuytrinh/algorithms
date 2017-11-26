package leetcode.decodeways

/**
 * https://leetcode.com/problems/decode-ways/description/
 */
class Solution {
  fun numDecodings(s: String): Int = when {
    s.isEmpty() -> 0
    else -> maxOf(decodeWays(s), 0)
  }

  private fun decodeWays(
      s: String,
      i: Int = 0,
      cache: MutableMap<Int, Int> = mutableMapOf()
  ): Int = when {
    i > s.lastIndex -> 0
    s[i] == '0' -> -1
    i == s.lastIndex -> 1
    else -> cache.getOrPut(i) {
      val w1 = decodeWays(s, i + 1, cache)
      val w2 = if ("${s[i]}${s[i + 1]}".toInt() <= 26) {
        decodeWays(s, i + 2, cache)
      } else {
        -1
      }
      when {
        w1 == -1 && w2 == -1 -> -1
        w1 == -1 -> maxOf(1, w2)
        w2 == -1 -> maxOf(1, w1)
        else -> maxOf(1, w1) + maxOf(1, w2)
      }
    }
  }
}
