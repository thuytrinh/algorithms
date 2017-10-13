package leetcode.threesum;

import java.util.*;

import static java.util.Collections.sort;

/**
 * https://leetcode.com/problems/3sum/description/
 */
public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    Set<List<Integer>> sumSet = new HashSet<>();
    Set<Integer> visits = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      int currentNumber = nums[i];
      if (visits.contains(currentNumber)) {
        continue;
      } else {
        visits.add(currentNumber);
      }

      List<List<Integer>> indicesList = find2Sum(nums, i + 1, 0 - currentNumber);
      for (List<Integer> indices : indicesList) {
        final List<Integer> newSum = Arrays.asList(
            currentNumber,
            indices.get(0),
            indices.get(1)
        );
        sort(newSum);
        sumSet.add(newSum);
      }
    }
    return new ArrayList<>(sumSet);
  }

  private List<List<Integer>> find2Sum(
      final int[] nums,
      final int startIndex,
      final int sum) {
    List<List<Integer>> r = new ArrayList<>();
    Set<Integer> subtractionSet = new HashSet<>();
    for (int i = startIndex; i < nums.length; i++) {
      final int currentNumber = nums[i];
      int s = sum - currentNumber;
      if (subtractionSet.contains(s)) {
        r.add(Arrays.asList(currentNumber, s));
      } else {
        subtractionSet.add(currentNumber);
      }
    }
    return r;
  }
}
