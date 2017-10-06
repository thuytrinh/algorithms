package leetcode.binarytreeboundary

fun node(value: Int, init: TreeNode.() -> Unit = {}): TreeNode {
  val newNode = TreeNode(value)
  newNode.init()
  return newNode
}

fun TreeNode.isEqualTo(that: TreeNode): Boolean = equal(this, that)

fun equal(dis: TreeNode?, that: TreeNode?): Boolean {
  return if (dis == null && that == null) {
    true
  } else {
    equal(dis?.left, that?.left) &&
        dis?.`val` == that?.`val` &&
        equal(dis?.right, that?.right)
  }
}
