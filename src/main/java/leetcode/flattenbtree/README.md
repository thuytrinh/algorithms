```
  1
 / \
2   3
```

* Temporarily hold `3`.
* Change `1`'s right tree into `2`. Clear `1`'s left tree.
* Change `2`'s right tree into `3`. Clear `2`'s left tree.

```
    1
   / \
  2   3
 /   /
4   6
```

* Flatten the subtree `2`.
* Flatten the subtree `3`.
* Temporarily hold root of the subtree `3`.
* Change `1`'s right tree into root of the subtree `2`. Clear `1`'s left tree.
* Get last node of the subtree `2`. Change the right node of this last node into root of the subtree `3`.
* Return last node of the flattened left subtree `2` if any.
* Return last node of the flattened right subtree `3` if any.
* Otherwise, return `1`.