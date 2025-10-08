/* Step - 3 --> Easy --> 3/14
Problem Statement : Given an array nums of n integers, return true if the array nums is
 sorted in non-decreasing order or else false.
 */
import java.util.Scanner;

public class self6 {
    public static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i - 1]) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers: ");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        // Check and print result
        if (isSorted(nums)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        sc.close();
    }
}