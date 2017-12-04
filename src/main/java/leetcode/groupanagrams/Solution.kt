package leetcode.groupanagrams

/**
 * https://leetcode.com/problems/group-anagrams/description/
 */
class Solution {
  fun groupAnagrams(strs: Array<String>): List<List<String>> {
    val map = mutableMapOf<List<Char>, MutableList<String>>()
    strs.forEach {
      val v = map.getOrPut(it.toList().sorted()) {
        mutableListOf()
      }
      v += it
    }
    return map.values
        .map { it.sorted() }
  }
}
