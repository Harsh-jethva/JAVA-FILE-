/* Step 3 --> Medium --> 1/14 */
/* Given an array of integers nums and an integer target. Return the indices(0 - indexed) of two elements in nums such that they add up to target.
Each input will have exactly one solution, and the same element cannot be used twice. Return the answer in increasing order.*/

import java.util.*;

public class self18 {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                int idx1 = map.get(complement);
                int idx2 = i;
                if (idx1 < idx2) return new int[]{idx1, idx2};
                else return new int[]{idx2, idx1};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
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

        System.out.println("Enter target value:");
        int target = sc.nextInt();

        int[] result = twoSum(nums, target);

        System.out.println("Indices of elements that sum to target:");
        System.out.println(result[0] + " " + result[1]);

        sc.close();
    }
}
