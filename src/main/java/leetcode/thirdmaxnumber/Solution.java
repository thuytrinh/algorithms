package leetcode.thirdmaxnumber;

import java.util.Set;
import java.util.TreeSet;

/**
 * https://leetcode.com/problems/third-maximum-number/description/
 */
public class Solution {
  public int thirdMax(int[] numbers) {
    Set<Integer> maxInts = new TreeSet<>();
    for (final int number : numbers) {
      addToMaxInts(maxInts, number);
    }
    return getThirdMax(maxInts);
  }

  private void addToMaxInts(
      final Set<Integer> maxInts,
      final int number) {
    if (maxInts.contains(number)) {
      return;
    }
    maxInts.add(number);
    if (maxInts.size() > 3) {
      maxInts.remove(maxInts.iterator().next());
    }
  }

  private int getThirdMax(final Set<Integer> maxInts) {
    if (maxInts.size() < 3) {
      return getLast(maxInts);
    } else {
      return maxInts.iterator().next();
    }
  }

  private int getLast(final Set<Integer> maxInts) {
    if (maxInts.isEmpty()) {
      throw new IllegalArgumentException("Set must not be empty");
    }
    int r = Integer.MIN_VALUE;
    for (int i : maxInts) {
      r = i;
    }
    return r;
  }
}
