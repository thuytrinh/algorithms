package leetcode.findcelebrity;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/find-the-celebrity/description/
 */
public class Solution extends Relation {
  // i = [a,b,c]
  // j = [a,b,c]
  public int findCelebrity(int n) {
    Map<List<Integer>, Boolean> cache = new HashMap<>();
    for (int i = 0; i < n; i++) {
      // To check whether i is a cele.
      if (isCele(n, i, cache)) {
        return i;
      }
    }
    return -1;
  }

  private boolean isCele(
      final int n,
      final int i,
      final Map<List<Integer>, Boolean> cache) {
    for (int other = 0; other < n; other++) {
      if (i != other) {

        if (!checkKnow(other, i, cache)) {
          return false;
        }
        if (checkKnow(i, other, cache)) {
          return false;
        }
      }
    }
    return true;
  }

  private boolean checkKnow(
      final int x,
      final int y,
      final Map<List<Integer>, Boolean> cache) {
    List<Integer> key = Arrays.asList(x, y);
    if (cache.containsKey(key)) {
      return cache.get(key);
    } else {
      final boolean r = knows(x, y);
      cache.put(key, r);
      return r;
    }
  }
}
