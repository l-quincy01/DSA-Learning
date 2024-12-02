# Binary Search

### Python

```python
def binarySearch(lst, target):
    first, last = 0, len(lst) - 1

    while first <= last:
        midpoint = (first + last) // 2
        element = lst[midpoint]

        if element == target:
            return midpoint

        elif target < element:
            last = midpoint - 1
        else:
            first = midpoint + 1

    return -1

myLst = [1, 5, 16, 88, 91, 95, 102, 1918, 2479]
result = binarySearch(myLst, 1)
print(result)
```

### Java

```Java

```

### C#

```C#

```

### C

```C

```
