package leetcode.sqrt;

/**
 * https://leetcode.com/problems/sqrtx/description/
 */
public class Solution {
  public int mySqrt(int x) {
    return computeSqrt(x, 0, x);
  }

  private int computeSqrt(final int x, final double l, final double r) {
    double m = (l + r) / 2.0;
    double m2 = m * m;
    if (checkEqual(m2, x)) {
      return (int) m;
    } else if (m2 > x) {
      return computeSqrt(x, l, m);
    } else {
      return computeSqrt(x, m, r);
    }
  }

  private boolean checkEqual(final double a, final int b) {
    return ((long) a) == b;
  }
}
