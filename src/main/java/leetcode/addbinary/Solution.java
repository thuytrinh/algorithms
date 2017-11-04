package leetcode.addbinary;

/**
 * https://leetcode.com/problems/add-binary/description/
 */
public class Solution {
  public String addBinary(String a, String b) {
    // 0 + 0 -> 0
    // ? + 0 -> 0
    // ? + 1 -> 1
    // 1 + 1 -> 10, value = 0, carry = 1
    // 1 + 0 -> 1
    /*

    11
    11
    --
     0 c=1
    10 c=1
   110 c=0

    11
     1
    --
     0 c=1
    00 c=1 NOTE: We got a carry left!
   100 c=0

    1) Convert chars into ints:
    '0'.toInt -> 48
    '1'.toInt -> 49
    x = '0'.toInt - '0'.toInt -> 0
    x = '1'.toInt - '0'.toInt -> 1

    2) Calculate sum of ints and extract v and carry:
    0 + 1     -> 1 c=1/2=0, v=1%2=1
    0 + 0     -> 0 c=0/2=0, v=0%2=0
    1 + 1     -> 2 c=2/2=1, v=2%2=0
    1 + 1 + 1 -> 3 c=3/2=1, v=3%2=1
     */
    int i = a.length() - 1;
    int j = b.length() - 1;
    StringBuilder s = new StringBuilder();
    int carry = 0;
    while (i >= 0 || j >= 0) {
      int r = carry;
      if (i >= 0) {
        r += a.charAt(i) - '0';
      }
      if (j >= 0) {
        r += b.charAt(j) - '0';
      }

      carry = r / 2;
      s.append(r % 2);

      i--;
      j--;
    }
    if (carry != 0) {
      s.append(carry);
    }
    return s.reverse().toString();
  }
}
