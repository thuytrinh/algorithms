package leetcode.numberislands;

/**
 * https://leetcode.com/problems/number-of-islands/description/
 */
public class Solution {
  public int numIslands(char[][] grid) {
    if (grid.length == 0) {
      return 0;
    }
    /*
    1 1 0
    1 1 0
    0 0 1 -> r = 2

    1 0 0 0
    1 0 1 1
    1 0 1 1 -> r = 2

    1 1 1 1
    0 0 0 1
    1 0 0 1
    0 0 1 1
    0 0 0 1 -> r = 2
     */
    byte[][] visits = new byte[grid.length][grid[0].length];
    int islandCount = 0;
    for (int r = 0; r < grid.length; r++) {
      for (int c = 0; c < grid[0].length; c++) {
        char cell = grid[r][c];
        if (cell != '0' && visits[r][c] != 1) {
          // We land on a new island.
          // Now try to visit the whole island via BFS.
          findIsland(grid, r, c, visits);
          islandCount++;
        }
      }
    }
    return islandCount;
  }

  private void findIsland(char[][] grid, int r, int c, byte[][] visits) {
    if (r < 0 || c < 0 || r == grid.length || c == grid[0].length) {
      // To avoid crossing the bounds.
      return;
    }
    char cell = grid[r][c];
    if (cell == '0' || visits[r][c] == 1) {
      // To avoid visiting water or previously visited points.
      return;
    }

    // _(r-1,c-1) 0(r-1,c) _(r-1,c+1)
    // 0(r,c-1)   x(r,c)   0(r,c+1)
    // _(r+1,c-1) 0(r+1,c) _(r+1,c+1)

    // _: We're not gonna visit it.
    // 0: Yeah, we're gonna visit.
    // x: We're here.

    visits[r][c] = 1;
    findIsland(grid, r - 1, c, visits);
    findIsland(grid, r, c - 1, visits);
    findIsland(grid, r, c + 1, visits);
    findIsland(grid, r + 1, c, visits);
  }
}
