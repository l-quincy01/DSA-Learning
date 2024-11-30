// using System;

// public class NumArray
// {
//     int[] prefix_arr;

//     public NumArray(int[] nums)
//     {
//         // Initialize prefix_arr with one extra space
//         prefix_arr = new int[nums.Length + 1];

//         // Fill prefix_arr and log values
//         for (int i = 0; i < nums.Length; i++)
//         {
//             prefix_arr[i + 1] = prefix_arr[i] + nums[i];
//             Console.WriteLine($"Step {i + 1}: i = {i}, nums[i] = {nums[i]}, prefix_arr = [{string.Join(", ", prefix_arr)}]");
//         }
//     }

//     public int SumRange(int left, int right)
//     {
//         int result = prefix_arr[right + 1] - prefix_arr[left];
//         Console.WriteLine($"SumRange({left}, {right}): left = {left}, right = {right}, result = {result}");
//         return result;
//     }
// }

// public class Program
// {
//     public static void Main()
//     {
//         int[] nums = { -2, 0, 3, -5, 2, -1 };
//         NumArray obj = new NumArray(nums);

//         // Test SumRange and log the result
//         int sum = obj.SumRange(0, 2);

//         Console.WriteLine($"Final SumRange({0}, {2}) Result: {sum}");
//     }
// }

// using System;
// using System.Collections.Generic;

// public class NumArray
// {
//     static int MaxSumSubarray(int[] nums, int k)
//     {
//         // Initial calculations
//         int windowSum = 0;
//         for (int i = 0; i < k; i++)
//         {
//             windowSum += nums[i];
//         }

//         int maxSum = windowSum;

//         // Trace table setup
//         List<string> traceTable = new List<string>
//         {
//             String.Format("{0,-10} {1,-20} {2,-15} {3,-10}", "Index i", "Window Elements", "Window Sum", "Max Sum")
//         };

//         // Initial window state
//         traceTable.Add(String.Format("{0,-10} {1,-20} {2,-15} {3,-10}",
//             0,
//             "[" + String.Join(", ", nums[0..k]) + "]",
//             windowSum,
//             maxSum
//         ));

//         // Slide the window across the array
//         for (int i = 1; i <= nums.Length - k; i++)
//         {
//             windowSum += nums[i + k - 1] - nums[i - 1];
//             maxSum = Math.Max(maxSum, windowSum);

//             // Add the current state to the trace table
//             traceTable.Add(String.Format("{0,-10} {1,-20} {2,-15} {3,-10}",
//                 i,
//                 "[" + String.Join(", ", nums[i..(i + k)]) + "]",
//                 windowSum,
//                 maxSum
//             ));
//         }

//         // Print the trace table
//         foreach (var row in traceTable)
//         {
//             Console.WriteLine(row);
//         }

//         return maxSum;
//     }

//     static void Main(string[] args)
//     {
//         int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
//         int k = 3;
//         Console.WriteLine("Max Sum of Subarray: " + MaxSumSubarray(nums, k));
//     }
// }


using System;
using System.Collections.Generic;

public class NumArray
{
    public int MaxSubArray(int[] nums)
    {
        int max_sum = int.MinValue; // Adjusted to use minimum integer value
        int curr_sum = 0;

        Console.WriteLine("i\tnums[i]\tcurr_sum\tmax_sum");
        Console.WriteLine("-------------------------------------");

        for (int i = 0; i < nums.Length; i++)
        {
            curr_sum += nums[i];
            max_sum = Math.Max(max_sum, curr_sum); // Use Math.Max for simplicity

            if (curr_sum < 0)
            {
                curr_sum = 0;
            }

            // Print the current values in the trace table
            Console.WriteLine($"{i}\t{nums[i]}\t\t{curr_sum}\t\t{max_sum}");
        }

        return max_sum;
    }
}

public class Program
{
    public static void Main(string[] args)
    {
        int[] nums = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        NumArray numArray = new NumArray(); // Create an instance of NumArray
        Console.WriteLine("Maximum Subarray Sum: " + numArray.MaxSubArray(nums));
    }
}

