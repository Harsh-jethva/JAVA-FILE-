/* Step 3 --> Medium -->10/14 */
/* Given an array nums of n integers.



Return the length of the longest sequence of consecutive integers. The integers in this sequence can appear in any order.
*/
import java.util.*;

public class self27 {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

        for (int num : set) {
            // Check only if it's the start of a sequence
            if (!set.contains(num - 1)) {
                int currentNum = num;
                int count = 1;

                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    count++;
                }

                longest = Math.max(longest, count);
            }
        }
        return longest;
    }

    public static void main(String[] args) {
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums1)); // 4 → [1,2,3,4]

        int[] nums2 = {0,3,7,2,5,8,4,6,0,1};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums2)); // 9 → [0..8]

        int[] nums3 = {9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6};
        System.out.println("Longest consecutive length: " + longestConsecutive(nums3)); // 7 → [-1..5]
    }
}