package leetcode.firstuniquechar;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/description/
 */
class Solution {
  public int firstUniqChar(String s) {
    final Map<Character, Integer> frequencies = loadFrequencies(s);
    for (int i = 0; i < s.length(); i++) {
      if (frequencies.get(s.charAt(i)) == 1) {
        return i;
      }
    }
    return -1;
  }

  private Map<Character, Integer> loadFrequencies(final String s) {
    final Map<Character, Integer> frequencies = new HashMap<>();
    for (int i = 0; i < s.length(); i++) {
      final char c = s.charAt(i);
      if (frequencies.containsKey(c)) {
        frequencies.put(c, frequencies.get(c) + 1);
      } else {
        frequencies.put(c, 1);
      }
    }
    return frequencies;
  }
}
