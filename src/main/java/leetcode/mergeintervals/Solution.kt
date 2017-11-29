package leetcode.mergeintervals

import leetcode.meetingrooms.Interval

/**
 * https://leetcode.com/problems/merge-intervals/description/
 */
class Solution {
  fun merge(intervals: List<Interval>): List<Interval> = when {
    intervals.isEmpty() -> emptyList()
    else -> {
      val sortedIntervals = intervals.sortedBy { it.start }
      val mergedIntervals = mutableListOf<Interval>()
      mergedIntervals += sortedIntervals.first()

      (1..sortedIntervals.lastIndex).forEach {
        val current = mergedIntervals.last()
        val next = sortedIntervals[it]
        when {
          current.end >= next.start -> {
            // e.g. [1,4] and [2,3] -> [1,4]
            current.end = maxOf(current.end, next.end)
          }
          else -> mergedIntervals += next
        }
      }
      mergedIntervals
    }
  }
}
