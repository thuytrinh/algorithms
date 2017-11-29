package leetcode.mergeintervals

import leetcode.meetingrooms.Interval
import org.amshove.kluent.shouldEqual
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().merge(listOf(
        Interval(1, 3),
        Interval(2, 6),
        Interval(8, 10),
        Interval(15, 18)
    )).shouldEqual(listOf(
        Interval(1, 6),
        Interval(8, 10),
        Interval(15, 18)
    ))
    Solution().merge(listOf(
        Interval(1, 4),
        Interval(2, 3)
    )).shouldEqual(listOf(
        Interval(1, 4)
    ))
    Solution().merge(listOf(
        Interval(1, 3)
    )).shouldEqual(listOf(
        Interval(1, 3)
    ))
  }
}
