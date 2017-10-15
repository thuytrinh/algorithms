package leetcode.meetingrooms;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://leetcode.com/problems/meeting-rooms/description/
 */
public class Solution {
  public boolean canAttendMeetings(Interval[] intervals) {
    Arrays.sort(intervals, new Comparator<Interval>() {
      @Override
      public int compare(final Interval lhs, final Interval rhs) {
        final int startResult = Integer.compare(lhs.start, rhs.start);
        if (startResult == 0) {
          return Integer.compare(lhs.end, rhs.end);
        } else {
          return startResult;
        }
      }
    });
    for (int i = 0; i < intervals.length - 1; i++) {
      if (intervals[i].end > intervals[i + 1].start) {
        return false;
      }
    }
    return true;
  }
}
