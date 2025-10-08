/* Step 3 --> Easy --> 10/14 */
/*Given an integer array of size n containing distinct values in the range from 0 to n (inclusive)
, return the only number missing from the array within this range.*/

import java.util.Scanner;

public class self13 {
    public static int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;
        for (int num : nums) {
            actualSum += num;
        }
        return expectedSum - actualSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (distinct, from 0 to " + n + "):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int missing = missingNumber(nums);

        System.out.println("The missing number is: " + missing);

        sc.close();
    }
}