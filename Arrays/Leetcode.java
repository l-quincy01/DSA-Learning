/*

LEETCODE************************************

 */

class Solution {

    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        for (int i = 1; i < nums.length; i++) {
            int prev = i - 1;
            int current = nums[i];   //here maintaining current is very imp as the number at this location changes. 
            while (prev >= 0 && current < nums[prev]) {
                nums[prev + 1] = nums[prev];
                prev--;
            }
            if (prev >= 0 && nums[prev] == current) {
                return true;
            }
            nums[prev + 1] = current;
        }
        return false;
    }
}

class Solution {

    public int singleNumber(int[] nums) {
        int xor = 0;

        for (int num : nums) {
            xor ^= num;
        }

        return xor;
    }
}
