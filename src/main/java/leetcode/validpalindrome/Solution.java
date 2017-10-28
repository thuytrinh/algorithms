package leetcode.validpalindrome;

/**
 * https://leetcode.com/problems/valid-palindrome/description/
 */
public class Solution {
  public boolean isPalindrome(String s) {
    if (s == null) {
      return false;
    }
    if (s.isEmpty()) {
      return true;
    }

    int lhs = 0;
    int rhs = s.length() - 1;
    while (lhs <= rhs) {
      final char lhsChar = s.charAt(lhs);
      if (!isValid(lhsChar)) {
        lhs++;
        continue;
      }
      final char rhsChar = s.charAt(rhs);
      if (!isValid(rhsChar)) {
        rhs--;
        continue;
      }
      if (!isEqual(lhsChar, rhsChar)) {
        return false;
      }
      lhs++;
      rhs--;
    }
    return true;
  }

  private boolean isEqual(final char lhsChar, final char rhsChar) {
    return Character.compare(
        Character.toLowerCase(lhsChar),
        Character.toLowerCase(rhsChar)
    ) == 0;
  }

  private boolean isValid(final char c) {
    return Character.isLetterOrDigit(c);
  }
}
