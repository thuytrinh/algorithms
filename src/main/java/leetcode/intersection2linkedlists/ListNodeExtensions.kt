package leetcode.intersection2linkedlists

fun ListNode?.isEqualTo(that: ListNode?): Boolean =
    if (this?.`val` == that?.`val`) {
      true
    } else {
      this?.next?.isEqualTo(that?.next) ?: false
    }

fun listNode(value: Int, init: ListNode.() -> Unit = {}): ListNode {
  val newNode = ListNode(value)
  newNode.init()
  return newNode
}
