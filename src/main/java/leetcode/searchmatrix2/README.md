```
[
  [1,   4,  7, 11, 15],
  [2,   5,  8, 12, 19],
  [3,   6,  9, 16, 22],
  [10, 13, 14, 17, 24],
  [18, 21, 23, 26, 30]
]
```

* Binary search on `[1, 4, 7, 11, 15]`:
  * If we find the target, return true.
  * Otherwise, return the index of max element which is smaller than the target. In this case, it's the index of `4`.
* Binary search on `[2, 5, 8, 12, 19]` but the right bound is the index we retrieved from earlier step. That means `[2, 5]`. We find `5`, then return true.

How binary search work?

Ex: `[1, 4, 7, 11, 15]`, target is 5.

middleIndex = (0 + 4) / 2 = 2, middle = 7. 7 > 5, so find on [1,4].