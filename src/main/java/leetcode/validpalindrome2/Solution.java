package leetcode.validpalindrome2;

/**
 * https://leetcode.com/problems/valid-palindrome-ii/description/
 * <p>
 * refs:
 * - http://www.geeksforgeeks.org/remove-character-string-make-palindrome/
 */
public class Solution {
  public boolean validPalindrome(String s) {
    if (s.isEmpty()) {
      return true;
    }
    // "abca" -> true. 'c' can be removed.
    // "abcca" -> true. 'b' can be removed.
    // "abcdca" -> true. 'b' can be removed.
    // "accba" -> true. 'b' can be removed.
    // "abcda" -> false. Any 2 chars in 'b', 'c', 'd' can be removed.
    // "accacc" -> true. First 'a' can be removed.
    // > you may delete at most one character
    // That means, validPalindrome(s) returns true if there exists a char
    // that if we remove it, s becomes palindrome.
    // So the idea is, when we iterate to check palindrome, if we find
    // any difference (aka s[i] != s[j]), validPalindrome(s) will depend
    // on the result that:
    // - If we ignore s[i], s is still a palindrome.
    // - Otherwise, if we ignore s[j], s is still a palindrome.
    int lhs = 0;
    int rhs = s.length() - 1;
    while (lhs <= rhs) {
      if (s.charAt(lhs) != s.charAt(rhs)) {
        return isPalindrome(s, lhs + 1, rhs) ||
            isPalindrome(s, lhs, rhs - 1);
      }
      lhs++;
      rhs--;
    }
    return true;
  }

  private boolean isPalindrome(
      final String s,
      int lhs,
      int rhs) {
    while (lhs <= rhs) {
      if (s.charAt(lhs) != s.charAt(rhs)) {
        return false;
      }
      lhs++;
      rhs--;
    }
    return true;
  }
}
