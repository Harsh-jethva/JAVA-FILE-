/* Step 3 --> Easy --> 13/14 */
/*Given an array nums of size n and an integer k, 
find the length of the longest sub-array that sums to k. 
If no such sub-array exists, return 0. */

import java.util.*;

public class self16 {
    public static int longestSubarrayWithSumK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0, maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (sum == k) {
                maxLength = i + 1;
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

            if (map.containsKey(sum - k)) {
                maxLength = Math.max(maxLength, i - map.get(sum - k));
            }
        }
        return maxLength;
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

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        int result = longestSubarrayWithSumK(nums, k);

        System.out.println("Length of the longest sub-array with sum " + k + " is: " + result);

        sc.close();
    }
}