# Chef-and-Subarray
CodeChef Difficulty 1191 Problem.


Chef loves research! Now he is looking for the **subarray of maximal length with non-zero product**.

Chef has an array `A` with `N` elements: `A1, A2, ..., AN`.

A **subarray** `A[i..j]` of array `A` consists of elements from index `i` to `j`:  
`Ai, Ai+1, ..., Aj`.

The **product** of a subarray `A[i..j]` is the product of all its elements.

Chef wants to find the length of the longest subarray such that the product of all elements in the subarray is **non-zero**.

## Input

- First line contains a single integer `N` — the number of elements in the array.
- Second line contains `N` space-separated integers `A1, A2, ..., AN` — the elements of the array.

## Output

- Print a single integer — the **maximal length** of a subarray with non-zero product.

## Constraints

- `1 ≤ N ≤ 10^5`
- `-10^9 ≤ Ai ≤ 10^9`

## Example

### Input
```
8
1 2 0 3 4 5 0 6
```

### Output
```
3
```

---
