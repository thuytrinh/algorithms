package leetcode.meetingrooms;

public class Interval {
  public int start;
  public int end;

  public Interval() {
    start = 0;
    end = 0;
  }

  public Interval(int s, int e) {
    start = s;
    end = e;
  }

  @Override
  public String toString() {
    return "[" + start + ", " + end + "]";
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Interval)) {
      return false;
    }
    Interval o = (Interval) obj;
    return start == o.start && end == o.end;
  }
}
