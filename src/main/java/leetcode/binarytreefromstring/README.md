Example: `(4(2)(3))`

One possible way to parse is:

* `(`: nextInt(`4`) -> 4. Push 4 into stack.
* `(`: nextInt(`2`) -> 2. Peek stack -> 4. Add 2 as left child of 4. Push 2 into stack.
* `)`: Pop stack. So, 2 is removed. Whenever encountering `)`, pop stack.
* `(`: nextInt(`3`) -> 3. Peek stack -> 4. 4 has a left child already. So, add 3 as right child of 4. Push 3 into stack.
* `)`: Pop stack. 3 is removed.
* `)`: Pop stack. 4 is removed.

How does nextInt() work? nextInt() will read chars from a given index until it doesn't encounter `-` or a digit.

Example: `(4)`

* `(`: nextInt(`4`) -> 4. Stack is empty. So, push 4 into stack.
* `)`: Pop stack.

Example: `(4(2))`

* `(`: nextInt(`4`) -> 4. Stack is empty. Push 4 into stack.
* `(`: nextInt(`2`) -> 2. Peek stack -> 4. Add 2 as left child of 4. Push 2 into stack.
* `)`: Pop stack. 2 is removed.
* `)`: Pop stack. 4 is removed.
