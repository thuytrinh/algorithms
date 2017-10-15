package leetcode.reverselinkedlist;

import leetcode.intersection2linkedlists.ListNode;

/**
 * https://leetcode.com/problems/reverse-linked-list/description/
 */
public class Solution {
  public ListNode reverseList(ListNode head) {
    if (head == null) {
      return null;
    }
    // return reverseRecursively(head, head.next);
    return reverseIteratively(head);
  }

  /**
   * O(n) for space complexity due to using function call stack.
   */
  private ListNode reverseRecursively(
      final ListNode node,
      final ListNode tail) {
    // A -> B -> C -> D
    //           C <- D
    //      B <- C
    // A <- B
    if (tail == null) {
      return node;
    }
    ListNode r = reverseRecursively(tail, tail.next);
    node.next = null;
    tail.next = node;
    return r;
  }

  private ListNode reverseIteratively(ListNode head) {
    // A -> B -> C -> D
    // A <- B
    //      B <- C
    //           C <- D
    ListNode node = head;
    ListNode tail = head.next;
    head.next = null;
    while (tail != null) {
      // To swap.
      ListNode tailNext = tail.next;
      tail.next = node;

      // To move.
      node = tail;
      tail = tailNext;
    }
    return node;
  }
}
