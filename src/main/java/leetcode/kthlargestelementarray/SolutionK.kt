package leetcode.kthlargestelementarray

import java.util.*

class SolutionK {
  fun findKthLargest(nums: IntArray, k: Int): Int {
    val heap = PriorityQueue<Int>(k)
    nums.forEach {
      // O(n)
      when {
        heap.size < k -> heap += it // O(log(k))
        it > heap.peek() -> {
          heap.poll() // O(log(k))
          heap += it  // O(log(k))
        }
      }
    }
    // -> O(n*log(k))
    return heap.peek()
  }
}
