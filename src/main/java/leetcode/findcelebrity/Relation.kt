package leetcode.findcelebrity

abstract class Relation {
  var knowPredicate: (Int, Int) -> Boolean = { _, _ -> false }

  fun knows(x: Int, y: Int) = knowPredicate(x, y)
}
