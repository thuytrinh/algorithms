package leetcode.binarytreefromstring

import leetcode.binarytreeboundary.isEqualTo
import leetcode.binarytreeboundary.node
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test

class SolutionTest {
  @Test
  fun test() {
    assertThat(Solution().str2tree("")).isNull()
    Solution().str2tree("4(2)(3)")?.isEqualTo(
        node(4) {
          left = node(2)
          right = node(3)
        }
    )
    Solution().str2tree("-4(2)")?.isEqualTo(
        node(-4) {
          left = node(2)
        }
    )
    Solution().str2tree("4(2(5))(3)")?.isEqualTo(
        node(4) {
          left = node(2) {
            left = node(5)
          }
          right = node(3)
        }
    )
  }
}
