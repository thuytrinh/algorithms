package leetcode.mergesortedarray;

/**
 * https://leetcode.com/problems/merge-sorted-array/description/
 */
public class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
    // nums1: [0,2,4,6,_,_,_]
    // nums2: [1,3,5]
    merge(nums1, m + n, nums1, m, nums2, n);
  }

  private void merge(
      final int[] mergeArray, final int mergeSize,
      final int[] nums1, final int m,
      final int[] nums2, final int n) {
    int p1 = m - 1;
    int p2 = n - 1;
    for (int i = mergeSize - 1; i >= 0; i--) {
      if (p1 == -1) {
        mergeArray[i] = nums2[p2];
        p2--;
      } else if (p2 == -1) {
        mergeArray[i] = nums1[p1];
        p1--;
      } else if (nums1[p1] >= nums2[p2]) {
        mergeArray[i] = nums1[p1];
        p1--;
      } else if (nums2[p2] > nums1[p1]) {
        mergeArray[i] = nums2[p2];
        p2--;
      }
    }
  }
}
