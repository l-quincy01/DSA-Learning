
public class MakeArrayZero {

//helper functions I made 
    public boolean fullOfZeros(int[] nums) {

        for (int num : nums) {
            if (num != 0) {
                return false;
            }

        }
        return true;
    }

    public int getSmallest(int[] nums) {

        int smallest = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > 0) {
                smallest = num < smallest ? num : smallest;
            }
        }
        return smallest;
    }

//main function given by leetcode
    public int minimumOperations(int[] nums) {

        int smallest = 0;
        int count = 0;

        while (!fullOfZeros(nums)) {

            smallest = getSmallest(nums);

            for (int j = 0; j < nums.length; j++) {

                nums[j] = nums[j] < smallest ? 0 : nums[j] - smallest;

            }
            count++;
        }

        return count;

    }

    public static void main(String[] args) {
        //add test cases
    }

}
