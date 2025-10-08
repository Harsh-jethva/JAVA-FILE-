/* Step 3 --> Medium -->9/14 */
/* Given an integer array nums, return a list of all the leaders in the array.



A leader in an array is an element whose value is strictly greater than all elements to its right in the given array. The rightmost element is always a leader. The elements in the leader array must appear in the order they appear in the nums array.*/
import java.util.*;

public class self26 {
    public static List<Integer> findLeaders(int[] nums) {
        List<Integer> leaders = new ArrayList<>();
        int n = nums.length;

        // Rightmost element is always a leader
        int maxFromRight = nums[n - 1];
        leaders.add(maxFromRight);

        // Traverse from right to left
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] > maxFromRight) {
                leaders.add(nums[i]);
                maxFromRight = nums[i];
            }
        }

        // Leaders were added in reverse order, so reverse the list
        Collections.reverse(leaders);
        return leaders;
    }

    public static void main(String[] args) {
        int[] nums = {16, 17, 4, 3, 5, 2};
        System.out.println("Leaders: " + findLeaders(nums));

        int[] nums2 = {7, 10, 4, 10, 6, 5, 2};
        System.out.println("Leaders: " + findLeaders(nums2));
    }
}