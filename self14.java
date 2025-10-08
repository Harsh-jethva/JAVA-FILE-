/* Step 3 --> Easy --> 11/14 */
/*Given a binary array nums, return the maximum number of consecutive 1s in the array.
A binary array is an array that contains only 0s and 1s. */
import java.util.Scanner;

public class self14 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCount = 0, currentCount = 0;
        for (int num : nums) {
            if (num == 1) {
                currentCount++;
                maxCount = Math.max(maxCount, currentCount);
            } else {
                currentCount = 0;
            }
        }
        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of binary array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = findMaxConsecutiveOnes(nums);

        System.out.println("Maximum number of consecutive 1s: " + result);

        sc.close();
    }
}