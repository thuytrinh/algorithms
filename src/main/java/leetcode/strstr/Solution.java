package leetcode.strstr;

/**
 * https://leetcode.com/problems/implement-strstr/description/
 */
public class Solution {
  public int strStr(String haystack, String needle) {
    // haystack = [0,1,2,3,4,5]
    // needle   = [0,1,2,3]
    // Only iterate from 0 to 2
    // with 2 is size(haystack) - size(needle).
    if (haystack == null
        || needle == null
        || haystack.length() < needle.length()) {
      return -1;
    }
    int endIndex = haystack.length() - needle.length();
    for (int i = 0; i <= endIndex; i++) {
      if (checkOccurrence(haystack, needle, i)) {
        return i;
      }
    }
    return -1;
  }

  private boolean checkOccurrence(
      final String haystack,
      final String needle,
      final int startIndex) {
    final int haystackEndIndex = needle.length();
    for (int i = startIndex, j = 0; i < startIndex + haystackEndIndex; i++, j++) {
      if (haystack.charAt(i) != needle.charAt(j)) {
        return false;
      }
    }
    return true;
  }
}
