/* Step 3 --> Medium --> 4/14 */
/* Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray. A subarray is a contiguous non-empty sequence of elements within an array.*/
import java.util.*;

public class self21 {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0], maxSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentSum = Math.max(nums[i], currentSum + nums[i]);
            maxSum = Math.max(maxSum, currentSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubArray(nums);

        System.out.println("The largest subarray sum is: " + result);

        sc.close();
    }
}