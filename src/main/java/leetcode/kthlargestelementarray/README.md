## Heap-based approach

Ex: [3,2,1,5,6,4]
k = 2

Need a min heap (e.g. `PriorityQueue`)

* 3: heap is empty. Add 3 into heap.
* 2: heap size is smaller than k. Add 2 into heap.
* 1: 1 is smaller than heap's min (2). Do nothing.
* 5: 5 is larger than heap's min (2). So, replace 2 with 5. heap = [3,5]
* 6: 6 is larger than heap's min (3). So, replace 3 with 6. heap = [5,6]
* 4: 4 is smaller than heap's min (5). Do nothing.

Eventually heap = [5,6]. Return heap's min (5).
