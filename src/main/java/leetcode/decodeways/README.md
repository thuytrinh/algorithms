https://leetcode.com/problems/decode-ways/description/

A -> 1
B -> 2
C -> 3
D -> 4
E -> 5
F -> 6
...
Z -> 26

Some special cases:
* 0 -> 0 way.
* 01 -> 0 way.
* 10 -> 1 way.
* 20 -> 1 way.
* 50 -> 0 way.
* 150 -> 0 way.

"12" -> AB | L -> 2 ways
"126" -> ABF | AZ | LF -> 3 ways

E.g. "12":
Given f("12") which returns the total number ways to decode "12".
* If we choose 1, we have one way to decode:
  * 1 -> A
  * 2 -> B
* If we choose 12, we have one way to decode: 12 -> L.
* Thus, the total number of ways to decode: 1 + 1 -> 2.

E.g. "123":
* If choosing 1 -> A, then we'll have to decode 23. There're 2 ways to decode 23. So the number of ways to decode is 2.
* If choosing 12 -> L, then we'll decode 3 and we got only one way to do this. So the number of ways to decode is 1.
* Thus, the total number of ways to decode is 2 + 1 -> 3.

E.g. "1234":
* 1,2,3,4
* 12,3,4
* 1,23,4
-> 3 ways?

d(s, i): Returns the number of ways to decode s.
* i > s.lastIndex -> 0
* Choose s[i] -> r += max(1, d(s, i + 1))
* If s[i] and s[i + 1] can be decoded into an alphabet char, choose s[i] and s[i + 1] -> r += max(1, d(s, i + 2))
