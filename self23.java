/* Step 3 --> Medium -->6/14 */
/* Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray. A subarray is a contiguous non-empty sequence of elements within an array.*/
public class self23 {
    public static int maxSubArray(int[] nums) {
        int maxSoFar = nums[0];   // store overall max
        int currentMax = nums[0]; // store current subarray max

        for (int i = 1; i < nums.length; i++) {
            // choose either current element alone or extend the current subarray
            currentMax = Math.max(nums[i], currentMax + nums[i]);
            // update overall max
            maxSoFar = Math.max(maxSoFar, currentMax);
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println("Maximum Subarray Sum: " + maxSubArray(nums));
    }
}