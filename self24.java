/* Step 3 --> Medium -->7/14 */
/*Given an integer array nums of even length consisting of an equal number of positive and negative integers.Return the answer array in such a way that the given conditions are met: Every consecutive pair of integers have opposite signs. For all integers with the same sign, the order in which they were present in nums is preserved. The rearranged array begins with a positive integer. */
import java.util.*;

public class self24 {
    public static int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        
        // Two indices: one for positives, one for negatives
        int posIndex = 0;
        int negIndex = 1;

        for (int num : nums) {
            if (num > 0) {
                result[posIndex] = num;
                posIndex += 2; // next available positive position
            } else {
                result[negIndex] = num;
                negIndex += 2; // next available negative position
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};
        int[] result = rearrangeArray(nums);

        System.out.print("Rearranged Array: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}