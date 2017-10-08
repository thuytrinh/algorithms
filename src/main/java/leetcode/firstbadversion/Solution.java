package leetcode.firstbadversion;

import java.util.function.Function;

public class Solution {
  private final Function<Integer, Boolean> _isBadVersion;

  public Solution(final Function<Integer, Boolean> _isBadVersion) {
    this._isBadVersion = _isBadVersion;
  }

  private boolean isBadVersion(int n) {
    return _isBadVersion.apply(n);
  }

  // Answer = 4
  public int firstBadVersion(int n) { // 5
    return find(1, n);
  }

  // start = 3
  // end = 4
  private int find(final int start, final int end) {
    if (start == end - 1 || start == end) { // true
      return isBadVersion(start) ? start : end; // Return 4
    } else {
      // 1,2,3,4,5,6 -> m=3=(1+6)/2=3.5
      // 1,2,3,4,5 -> m=3=(1+5)/2=3
      // Use double to avoid numeric overflow which
      // leads to incorrect result.
      int m = (int) ((start + (double) end) / 2.0); // m=4
      if (isBadVersion(m)) { // false
        return find(start, m);
      } else {
        return find(m, end);
      }
    }
  }
}
