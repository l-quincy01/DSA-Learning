
class Solution {

    public double findMaxAverage(int[] nums, int k) {

        int windowSize = k;
        double sum = 0;
        double maxAvg = 0;

        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        maxAvg = sum / k;

        for (int j = k; j < nums.length; j++) {

            sum -= nums[j - k];
            sum += nums[j];

            maxAvg = (sum / k) > maxAvg ? sum / k : maxAvg;
        }

        return maxAvg;

    }
}
