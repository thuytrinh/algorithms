package leetcode.palindromelinkedlist;

import leetcode.intersection2linkedlists.ListNode;

public class Solution {
  public boolean isPalindrome(ListNode head) {
    if (head == null) {
      return true;
    }

    ListNode[] forward = new ListNode[]{head};
    return optimalSolution(forward, head);
  }

  /**
   * "aba" -> true
   * "racecar" -> true
   * "aa" -> true
   */
  private boolean optimalSolution(
      final ListNode[] forward,
      final ListNode tail) {
    if (tail == null) {
      return true;
    }
    boolean previousResult = optimalSolution(forward, tail.next);
    if (!previousResult) {
      return false;
    }

    if (forward[0] == null) {
      // That means we've reached the middle
      // like 'e' in the case of "racecar" or the case of "abba".
      return true;
    }

    // To check the case of "racecar" where
    // forward[0] is 'e' and tail is also 'e'.
    if (forward[0] == tail) {
      forward[0] = null;
      return true;
    }

    boolean result = forward[0].val == tail.val;
    forward[0] = forward[0].next;

    // To check the case of "abba".
    if (forward[0] == tail) {
      forward[0] = null;
    }
    return result;
  }
}
