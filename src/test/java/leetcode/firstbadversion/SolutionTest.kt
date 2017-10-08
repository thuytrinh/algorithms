package leetcode.firstbadversion

import org.amshove.kluent.shouldEqualTo
import org.junit.Test

class SolutionTest {
  @Test
  fun case0() {
    Solution { it >= 1 }.firstBadVersion(2).shouldEqualTo(1)
    Solution { it >= 3 }.firstBadVersion(5).shouldEqualTo(3)
    Solution { it >= 3 }.firstBadVersion(7).shouldEqualTo(3)
    Solution { it >= 4 }.firstBadVersion(10).shouldEqualTo(4)
    Solution { it >= 1 }.firstBadVersion(10).shouldEqualTo(1)
    Solution { it >= 10 }.firstBadVersion(19).shouldEqualTo(10)
    Solution { it >= 1 }.firstBadVersion(1).shouldEqualTo(1)
    Solution { it >= 1 }.firstBadVersion(2).shouldEqualTo(1)
    Solution { it >= 3 }.firstBadVersion(3).shouldEqualTo(3)
    Solution { it >= 1702766719 }.firstBadVersion(2126753390).shouldEqualTo(1702766719)
  }
}
