# Sliding Window

A technique to efficiently process a subset of Data, by focusing on only the most relevant portion in a gien time

### Types
`1.` Fixed sliding window. The window has/maintains a fixed constant length.
Applicable  for find subarrays or substrings of a fixed length

## `Questions`

1.  Maximum Average Subarray I. You are given an integer array nums consisting of n elements, and an integer k.
 Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.




`2.` Dynamic sliding window. Window size expands or contracts based on conditions.

Applicable  for  find longest or shortest subarray/substring that satisfies a condition

### Python

```python
def maxFiveBooks(lst):
    if len(lst) < 5:
        return -1
    window_sum = sum(lst[:5])
    max_sum = window_sum
    indexesLst = []
    startIndex = 0

    for i in range(len(lst) - 5):
        window_sum += lst[5 + i] - lst[i]

        if max_sum < window_sum:
            indexesLst = []
            startIndex = i
            max_sum = window_sum
            for j in range(5):
                startIndex += 1
                indexesLst.append(startIndex)

    return {"Maximum cost": max_sum, "Books": indexesLst}


mylst = [9, 3, 9, 1, 99, 182, 500, 383, 1, 9, 1, 3, 2, 45, 35, 999999]
print(maxFiveBooks(mylst))
```

### Java

```java
class Solution {
    public int maxSubArray(int[] nums) {
    int sum = 0  ;
    int max = nums[0] ;
    for(int i = 0; i < nums.length ; i++){
        sum += nums[i] ;
        max = Math.max(sum, max) ;

        if (sum < 0) {
            sum = 0;
        }
    }
        return max ;
    }
}
```
