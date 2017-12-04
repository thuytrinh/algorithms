package leetcode.lettercombinations

import java.util.*

class Solution {
  private val kb = hashMapOf(
      '1' to "",
      '2' to "abc",
      '3' to "def",
      '4' to "ghi",
      '5' to "jkl",
      '6' to "mno",
      '7' to "pqrs",
      '8' to "tuv",
      '9' to "wxyz",
      '0' to ""
  )

  fun letterCombinations(digits: String): List<String> {
    // "abc" and "def"
    // * Pick 'a'. Push 'a'.
    // * Pick 'd'. Push 'd'.
    // * Print stack. Pop stack.
    // * Pick 'e'. Push 'e'.
    // * Print stack. Pop stack.
    return when {
      digits.isEmpty() -> emptyList()
      else -> {
        val texts: List<String> = digits.map { kb[it] ?: "" }
        val result = mutableListOf<String>()
        generate(texts, 0, result, Stack())
        result
      }
    }
  }

  private fun generate(
      texts: List<String>, // texts = ["abc", "def"]
      i: Int, // i = 2
      result: MutableList<String>, // result = []
      stack: Stack<Char> // stack = [a, e]
  ) {
    when (i) { // i = 2
      texts.size -> { // size = 2
        // result = ["ad", "ae"]
        result += stack.joinToString(separator = "")
      }
      else -> texts[i].forEach {
        stack += it // it = 'f', stack = [a, f]
        generate(texts, i + 1, result, stack)
        stack.pop() // stack = [a]
      }
    }
  }
}
