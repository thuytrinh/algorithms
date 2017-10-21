package leetcode.wordbreak;

import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/word-break/description/
 */
public class Solution {
  // * Sub-problems?
  // Sub-problems: B(x,n)
  // Sub-problem count: n
  // * Guess?
  // Given a string: [0..n]
  // Guess a x inside [0..n]
  // So, if word(0,x) is in dict, we figure out B(x+1,n).
  // * Choices?
  // How many guess? In worst case, n guesses.
  // B(0,n) is true if there exists a word(0,x) such that
  // B(x+1,n) is true.
  // * Recurrence?
  public boolean wordBreak(String s, List<String> wordDict) {
    final HashMap<Integer, Boolean> cache = new HashMap<>();
    return canBreakWord(s, 0, wordDict, cache);
  }

  private boolean canBreakWord(
      final String s,
      final int start,
      final List<String> wordDict,
      final HashMap<Integer, Boolean> cache) {
    if (cache.containsKey(start)) {
      return cache.get(start);
    }
    if (s.isEmpty()) {
      return true;
    }
    for (int i = 0; i < s.length(); i++) {
      String prefix = s.substring(0, i + 1);
      if (wordDict.contains(prefix)) {
        boolean r = canBreakWord(
            s.substring(i + 1, s.length()),
            i + 1,
            wordDict,
            cache
        );
        cache.put(i, r);
        if (r) {
          return true;
        }
      }
    }
    return false;
  }
}
