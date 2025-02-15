// using System;
// using System.Collections.Generic;

// class Program
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
//         int[] nums = { 2, 1, 5, 1, 3, 2 };
//         int k = 3;
//         Console.WriteLine("Max Sum of Subarray: " + MaxSumSubarray(nums, k));
//     }
// }


/* Kadene Algorithim with TRACETABLE DYNAMIC PROG MaxSubArray


using System;

public class Solution {
    public int MaxSubArray(int[] nums) {
        int max_sum = -999999999;
        int curr_sum = 0;

        Console.WriteLine("i\tnums[i]\tcurr_sum\tmax_sum");
        Console.WriteLine("-------------------------------------");

        for (int i = 0; i < nums.Length; i++) {
            curr_sum += nums[i];

            if (max_sum >= curr_sum) {
                max_sum = max_sum;
            } else {
                max_sum = curr_sum;
            }

            if (curr_sum < 0) {
                curr_sum = 0;
            }

            // Print the current values in the trace table
            Console.WriteLine($"{i}\t{nums[i]}\t\t{curr_sum}\t\t{max_sum}");
        }
        
        return max_sum;
    }
}

*/

