using System;

public class NumArray
{
    int[] prefix_arr;

    public NumArray(int[] nums)
    {
        // Initialize prefix_arr with one extra space
        prefix_arr = new int[nums.Length + 1];

        // Fill prefix_arr and log values
        for (int i = 0; i < nums.Length; i++)
        {
            prefix_arr[i + 1] = prefix_arr[i] + nums[i];
            Console.WriteLine($"Step {i + 1}: i = {i}, nums[i] = {nums[i]}, prefix_arr = [{string.Join(", ", prefix_arr)}]");
        }
    }

    public int SumRange(int left, int right)
    {
        int result = prefix_arr[right + 1] - prefix_arr[left];
        Console.WriteLine($"SumRange({left}, {right}): left = {left}, right = {right}, result = {result}");
        return result;
    }
}

public class Program
{
    public static void Main()
    {
        int[] nums = { 1, 2, 3, 4 };
        NumArray obj = new NumArray(nums);

        // Test SumRange and log the result
        int left = 1;
        int right = 3;
        int sum = obj.SumRange(left, right);

        Console.WriteLine($"Final SumRange({left}, {right}) Result: {sum}");
    }
}
/* BRUTE FORCE*****************************************************************************
public class Solution {
    public int SubarraySum(int[] nums, int k) {
        
        int cnt = 0 ;

        for(int i = 0 ; i < nums.Length - 1; i++){

            for(int j = 0; j < nums.Length - 1; j++){
                if( i != j && nums[i] + nums[j] ==k){
                    cnt++ ;
                }

            }
        }
        return cnt ;
    }
}

*/

// public class Solution {
//     public int SubarraySum(int[] nums, int k) {

//         int[] prefix_sum = new int[nums.Length + 1] ;
//         int count = 0 ;

//         for(int i = 0 ; i > nums.Length; i++){
//             prefix_sum[i+1] = nums[i] + prefix_sum[i]; 
//             if(prefix_sum[i] == k || prefix_sum[i+1] == k ){
//                 count++ ;
//             }
//         }
//             int start = 0 ;
//             int end  = prefix_sum.Length -1  ;
//         while( start < end ){

//             if (prefix_sum[end] - prefix_sum[start] == k){
//                     count++ ;
//             }
//             start++ ;
//             end--;
//         }

//         return count;

//     }
// }