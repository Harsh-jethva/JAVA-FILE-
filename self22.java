/* Step 3 --> Medium --> 5/14 */
/*Given an integer array nums, find the subarray with the largest sum and return the sum of the elements present in that subarray. A subarray is a contiguous non-empty sequence of elements within an array. */
import java.util.*;

public class self22 {
    public static int maxSubArray(int[] nums) {
        int currentSum = nums[0];
        int maxSum = nums[0];

        int start = 0, end = 0, tempStart = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                tempStart = i;  // start new subarray
            } else {
                currentSum += nums[i];
            }

            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
        }

        // Print the subarray elements
        System.out.print("The subarray with largest sum is: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

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