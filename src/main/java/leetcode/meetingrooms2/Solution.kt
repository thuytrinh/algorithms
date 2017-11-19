package leetcode.meetingrooms2

import leetcode.meetingrooms.Interval
import java.util.*

typealias RoomEndTime = Int
typealias Rooms = PriorityQueue<RoomEndTime>

/**
 * https://leetcode.com/problems/meeting-rooms-ii/description/
 */
class Solution {
  private fun RoomEndTime.hasNoOverlap(i: Interval): Boolean = this <= i.start

  fun minMeetingRooms(intervals: Array<Interval>): Int {
    if (intervals.isEmpty()) {
      return 0
    }

    intervals.sortBy { it.start }
    val rooms = Rooms()
    intervals.forEach {
      when {
        rooms.isNotEmpty() && rooms.peek().hasNoOverlap(it) -> {
          rooms.poll()
          rooms.offer(it.end)
        }
        else -> rooms.offer(it.end)
      }
    }
    return rooms.size
  }
}
