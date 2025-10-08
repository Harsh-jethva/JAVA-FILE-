/* Step 3 --> Easy --> 5/14 */
/* Given an integer array nums, rotate the array to the left by one.
Note: There is no need to return anything, just modify the given array.*/
import java.util.Scanner;

public class self9 {
    public static void rotateLeftByOne(int[] nums) {
        if (nums.length == 0) return;
        int first = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = first;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        rotateLeftByOne(nums);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}