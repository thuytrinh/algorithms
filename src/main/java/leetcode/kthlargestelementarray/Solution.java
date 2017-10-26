package leetcode.kthlargestelementarray;

import java.util.Arrays;
import java.util.PriorityQueue;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/description/
 * <p>
 * refs:
 * - https://www.coursera.org/learn/algorithms-part1/lecture/UQxFT/selection
 * - https://en.wikipedia.org/wiki/Quickselect
 * - https://docs.oracle.com/javase/7/docs/api/java/util/PriorityQueue.html
 */
public class Solution {
  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> queue = new PriorityQueue<>(
        nums.length,
        (lhs, rhs) -> {
          int d = lhs - rhs;
          return d == 0 ? d : (d < 0 ? 1 : -1);
        }
    );
    for (final int num : nums) {
      queue.add(num);
    }
    for (int i = 0; i < k - 1; i++) {
      queue.poll();
    }
    return queue.peek();
  }

  private int sortBasedSolution(final int[] nums, final int k) {
    // [3,2,1,5,6,4] k = 2 => r = 5.
    // Why?
    // [1,2,3,4,5,6]
    // index of 5 is 4.
    // size = 6.
    // k = 2.
    // => index of 5 is size - k.
    // what if k is 6? then look for
    // (size - k) = 6 - 6 = 0th element.
    Arrays.sort(nums);
    return nums[nums.length - k];
  }
}
