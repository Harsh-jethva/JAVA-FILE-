/* Step 3 --> Easy --> 7/14 */
/* Given an integer array nums, move all the 0's to the end of the array. 
The relative order of the other elements must remain the same. 
This must be done in place, without making a copy of the array.*/
import java.util.Scanner;

public class self11 {
    public static void moveZeros(int[] nums) {
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
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

        moveZeros(nums);

        System.out.println("Array after moving zeros to the end:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}