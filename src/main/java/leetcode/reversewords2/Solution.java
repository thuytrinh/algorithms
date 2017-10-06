package leetcode.reversewords2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-ii/description/
 */
public class Solution {
  public void reverseWords(char[] s) {
    if (s == null || s.length == 0) {
      return;
    }

    final List<String> words = Arrays.asList(String.valueOf(s).split(" "));
    Collections.reverse(words);
    final StringBuilder builder = new StringBuilder();
    for (int i = 0; i < words.size(); i++) {
      final String word = words.get(i);
      builder.append(word);
      if (i != words.size() - 1) {
        builder.append(" ");
      }
    }
    final String reversedS = builder.toString();
    for (int i = 0; i < s.length; i++) {
      s[i] = reversedS.charAt(i);
    }
  }
}