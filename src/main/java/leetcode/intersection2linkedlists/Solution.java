package leetcode.intersection2linkedlists;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/intersection-of-two-linked-lists/
 */
public class Solution {
  public ListNode getIntersectionNode(
      ListNode headA,
      ListNode headB) {
    return getIntersectionNodeNonOptimally(headA, headB);
  }

  private ListNode getIntersectionNodeNonOptimally(
      final ListNode headA,
      final ListNode headB) {
    if (headA == null || headB == null) {
      return null;
    }

    Set<ListNode> visits = new HashSet<>();
    ListNode a = headA;
    while (a != null) {
      visits.add(a);
      a = a.next;
    }

    ListNode b = headB;
    while (b != null) {
      if (visits.contains(b)) {
        return b;
      }
      b = b.next;
    }

    return null;
  }
}
