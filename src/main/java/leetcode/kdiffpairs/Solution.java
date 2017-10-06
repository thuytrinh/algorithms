package leetcode.kdiffpairs;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/k-diff-pairs-in-an-array/description/
 */
public class Solution {
  public int findPairs(int[] nums, int k) {
    if (k < 0) {
      // Because absolute value is always non-negative (k >= 0).
      return 0;
    }

    Set<Set<Integer>> matchedPairs = new HashSet<>();
    Set<Integer> visits = new HashSet<>();
    for (final int num : nums) {
      int[] possiblePeers = findPossiblePeersForDiff(num, k);
      for (int possiblePeer : possiblePeers) {
        if (visits.contains(possiblePeer)) {
          Set<Integer> newMatchedPair = new TreeSet<>();
          newMatchedPair.add(num);
          newMatchedPair.add(possiblePeer);
          matchedPairs.add(newMatchedPair);
        }
      }
      visits.add(num);
    }
    return matchedPairs.size();
  }

  private int[] findPossiblePeersForDiff(final int i, final int k) {
    // k = |x - i|
    // => k == x - i or
    // => k == i - x
    // So, x = k + i or x = i - k.

    // e.g. i = 1, k = 2 => x = 3 | -1.
    // e.g. i = 3, k = 1 => x = 4 | 2
    return new int[]{i + k, i - k};
  }
}
