i0: [1,5]
i1: [2,3]
i3: [3,5]
i4: [7,8]

Given a list of rooms, and a given event, 
which room we should add to achieve min count of rooms? 
Choose the room having earliest finish. However, if the event overlaps with the 
room, that means it can't fit the other rooms. So, new room should be created.

If we have a list of events, which event we should choose to achieve min count 
of rooms? With a room having earliest finish, the gap between room finish time 
and the event's start time should be minimal. That means, we should select the 
event having earliest start time.

Solution:

* Sort by earliest start
* For each event and given a room list:
  * Select a room having earliest finish
  * If we can't add this event into the selected room, 
  that means we can't add it into other rooms. 
  So create a new room for this event.
  * Otherwise, add it into the selected room. 
  Also, we'll have to change the finish time of this room.