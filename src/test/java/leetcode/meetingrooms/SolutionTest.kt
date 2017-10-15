package leetcode.meetingrooms

import org.amshove.kluent.shouldBeFalse
import org.amshove.kluent.shouldBeTrue
import org.junit.Test

class SolutionTest {
  @Test
  fun canAttendMeetings() {
    Solution().canAttendMeetings(arrayOf(
        Interval(0, 30),
        Interval(5, 10),
        Interval(15, 20)
    )).shouldBeFalse()

    Solution().canAttendMeetings(arrayOf(
        Interval(0, 30),
        Interval(30, 35),
        Interval(35, 40)
    )).shouldBeTrue()

    Solution().canAttendMeetings(arrayOf(
        Interval(0, 30),
        Interval(30, 35),
        Interval(34, 40)
    )).shouldBeFalse()
  }
}
