package leetcode.findallanagrams;

import java.util.*;

/**
 * https://leetcode.com/problems/find-all-anagrams-in-a-string/description/
 */
class Solution {
  public List<Integer> findAnagrams(String source, String pattern) {
    if (source == null) {
      return Collections.emptyList();
    }
    if (source.length() < pattern.length()) {
      return Collections.emptyList();
    }

    // "abc", "bac" -> true
    // "abb", "ab" -> false
    // "aab", "ab" -> false
    final List<Integer> result = new ArrayList<>();
    final Map<Character, Integer> sourceFrequencies = createFrequencies(source, 0, pattern.length());
    final Map<Character, Integer> patternFrequencies = createFrequencies(pattern, 0, pattern.length());
    for (int i = 0; i < source.length(); i++) {
      final int subStringBound = i + pattern.length();
      if (subStringBound <= source.length()) {
        if (sourceFrequencies.equals(patternFrequencies)) {
          result.add(i);
        }

        final char oldChar = source.charAt(i);
        final Integer oldCharFrequency = sourceFrequencies.get(oldChar);
        if (oldCharFrequency == 1) {
          sourceFrequencies.remove(oldChar);
        } else {
          sourceFrequencies.put(oldChar, oldCharFrequency - 1);
        }

        if (subStringBound < source.length()) {
          final char newChar = source.charAt(subStringBound);
          final int newCharFrequency = sourceFrequencies.get(newChar) == null ? 1 : (sourceFrequencies.get(newChar) + 1);
          sourceFrequencies.put(newChar, newCharFrequency);
        }
      }
    }
    return result;
  }

  private Map<Character, Integer> createFrequencies(final String s, int start, int end) {
    final Map<Character, Integer> frequencies = new HashMap<>();
    for (int i = start; i < end; i++) {
      final char c = s.charAt(i);
      final Integer f = frequencies.get(c);
      if (f == null) {
        frequencies.put(c, 1);
      } else {
        frequencies.put(c, f + 1);
      }
    }
    return frequencies;
  }
}
