/* Step 3 --> Easy --> 8/14
Problem Statement : Given an array of integers nums and an integer target, find the smallest index (0 based indexing) where the target appears in the array
If the target is not found in the array, return -1
*/
import java.util.Scanner;

public class self7 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
        int index = findTargetIndex(nums, target);
        System.out.println("Index of target: " + index);
        sc.close();
    }
    public static int findTargetIndex(int[] nums, int target) 
    {
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
