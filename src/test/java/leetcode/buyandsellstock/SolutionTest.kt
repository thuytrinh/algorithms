package leetcode.buyandsellstock

import org.amshove.kluent.shouldEqualTo
import org.junit.Test
import java.util.concurrent.ThreadLocalRandom.current

class SolutionTest {
  @Test
  fun test() {
    Solution().maxProfit(intArrayOf(7, 1, 5, 3, 6, 4))
        .shouldEqualTo(5)
    Solution().maxProfit(intArrayOf(7, 6, 4, 3, 1))
        .shouldEqualTo(0)
  }

  @Test
  fun testOptimalSolution() {
    for (i in 0..100) {
      val prices = createRandomPrices(current().nextInt(1, 2000))
      Solution().maxProfit(prices)
          .shouldEqualTo(Solution().maxProfitNonOptimally(prices))
    }
  }

  private fun createRandomPrices(size: Int): IntArray =
      (0 until size)
          .map {
            current().nextInt(1, 100)
          }
          .toIntArray()
}
