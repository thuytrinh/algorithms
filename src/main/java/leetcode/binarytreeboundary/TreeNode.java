package leetcode.binarytreeboundary;

import org.jetbrains.annotations.Nullable;

public class TreeNode {
  public int val;
  @Nullable
  public TreeNode left;
  @Nullable
  public TreeNode right;

  public TreeNode(int x) {
    val = x;
  }

  @Override
  public String toString() {
    return String.valueOf(val);
  }
}
