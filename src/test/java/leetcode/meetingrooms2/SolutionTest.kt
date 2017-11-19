package leetcode.meetingrooms2

import leetcode.meetingrooms.Interval
import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    Solution().minMeetingRooms(arrayOf(
        Interval(1, 5),
        Interval(2, 3),
        Interval(3, 5),
        Interval(7, 8)
    )).shouldEqualTo(2)
    Solution().minMeetingRooms(arrayOf(
        Interval(2, 15),
        Interval(36, 45),
        Interval(9, 29),
        Interval(16, 23),
        Interval(4, 9)
    )).shouldEqualTo(2)
  }
}
