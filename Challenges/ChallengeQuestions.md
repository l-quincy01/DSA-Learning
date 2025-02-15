# Challenge Questions 

1.  

Destination city
You are given the array paths, where paths[i] = [cityAi, cityBi] means there exists a direct path going from cityAi to cityBi. Return the destination city, that is, the city without any path outgoing to another city.

It is guaranteed that the graph of paths forms a line without any loop, therefore, there will be exactly one destination city.

Example 1:
Input: paths = [["London","New York"], ["New York", "Lima"],  ["Lima", "Sao Paulo"]]
Output: "Sao Paulo"

Explanation: Starting at "London" city you will reach "Sao Paulo" city which is the destination city. Your trip consist of:
"London" > "New York" > "Lima" -> "Sao
Paulo".

2. 

Check if Every Row and Column Contains All Numbers
An nxn matrix is valid if every row and every column contains all the integers
from 1 to n (inclusive).
Given an n x n integer matrix matrix, return true if the matrix is valid.
Otherwise, return false.

Example 1:
Input: matrix = [|1,2,3],[3,1,21,[2,3,1]]
Output: true
Explanation: In this case, n = 3, and
every row and column contains the numbers 1, 2, and 3.
Hence, we return true.


3. 

You are given two strings s1 and s2 of equal length. A string swap is an operation where you choose two indices in a string (not necessarily different) and swap the characters at these indices.

Return true if it is possible to make both strings equal by performing at most one string swap on exactly one of the strings. Otherwise, return false.

 
Example 1:

Input: s1 = "bank", s2 = "kanb"
Output: true
Explanation: For example, swap the first character with the last character of s2 to make "bank".
Example 2:

Input: s1 = "attack", s2 = "defend"
Output: false
Explanation: It is impossible to make them equal with one string swap.
Example 3:

Input: s1 = "kelb", s2 = "kelb"
Output: true
Explanation: The two strings are already equal, so no string swap operation is required.


4.  
Write a Java program that calculates a sequence where: The first four numbers are initialized as their respective indices (i.e., 1, 2, 3, 4).
Each subsequent number in the sequence is the sum of the previous four numbers.