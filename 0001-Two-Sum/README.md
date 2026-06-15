# 1. Two Sum

## Problem Statement

Given an array of integers `nums` and an integer `target`,
return the indices of the two numbers such that they add up to `target`.

You may assume that each input has exactly one solution, and you may not use the same element twice.

---

## Example

Input:

```text
nums = [2,7,11,15]
target = 9
```

Output:

```text
[0,1]
```

Explanation:

```text
nums[0] + nums[1] = 2 + 7 = 9
```

---

## Approach

This solution uses a brute-force approach.

1. Pick the first element using the outer loop.
2. Compare it with every remaining element using the inner loop.
3. Check whether their sum equals the target.
4. If a valid pair is found, return their indices immediately.

---

## Dry Run

Input:

```text
nums = [2,7,11,15]
target = 9
```

### Iteration 1

```text
i = 0 (2)
j = 1 (7)

2 + 7 = 9 ✓
```

Return:

```text
[0,1]
```

---

## Complexity Analysis

### Time Complexity

```text
O(n²)
```

In the worst case, every pair of elements is checked.

### Space Complexity

```text
O(1)
```

No extra data structure is used.

---

## Concepts Used

- Arrays
- Nested Loops
- Brute Force Search

---

## Notes

This is the straightforward brute-force solution.

A more optimized approach can be implemented using a HashMap, reducing the time complexity to O(n).


Approach            Time                Space

Brute Force         O(n²)               O(1)

HashMap             O(n)                O(n)