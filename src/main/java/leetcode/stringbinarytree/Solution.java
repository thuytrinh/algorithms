package leetcode.stringbinarytree;

/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/description/
 */
class Solution {
  public String tree2str(final TreeNode root) {
    if (root == null) {
      return "";
    }

    //   1
    //  /
    // 2
    // -> 1(2)
    //  1
    //   \
    //    2
    // -> 1()(2)
    // If left node is absent, we print '()'.
    // If right node is absent, we print nothing.
    // If a node having no children, simply print (val).

    final StringBuilder stringBuilder = convertToString(root);
    stringBuilder.deleteCharAt(0);
    stringBuilder.deleteCharAt(stringBuilder.length() - 1);
    return stringBuilder.toString();
  }

  private StringBuilder convertToString(final TreeNode root) {
    final StringBuilder strings = new StringBuilder();
    strings.append('(').append(root.val);

    if (root.left != null || root.right != null) {
      if (root.left == null) {
        strings.append("()");
      } else {
        strings.append(convertToString(root.left).toString());
      }
      if (root.right != null) {
        strings.append(convertToString(root.right).toString());
      }
    }

    return strings.append(")");
  }

  static class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
      val = x;
    }
  }
}
