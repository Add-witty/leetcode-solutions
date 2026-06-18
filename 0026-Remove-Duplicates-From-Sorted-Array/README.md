26. Remove Duplicates from Sorted Array

Approach:

This solution uses the Two Pointers technique.

* read scans the array.
* write keeps track of the position for the next unique element.
* When a new unique value is found, it is placed at the write position.
* Since the array is sorted, duplicates appear consecutively and can be skipped efficiently.

Complexity:

* Time Complexity: O(n)
* Space Complexity: O(1)

Concepts Used:

* Arrays
* Two Pointers
* In-Place Modification