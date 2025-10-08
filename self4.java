/* Step 3 --> Easy --> 1/14
Problem Statement : Given an array of integers nums, return the value of the largest element in the array
 */

import java.util.Scanner;

public class self4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i < n; i++) 
        {
            nums[i] = sc.nextInt();
        }

        int largest = findLargest(nums);
        System.out.println("The largest element in the array is: " + largest);
        sc.close();
    }
    public static int findLargest(int[] nums) 
    {
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) 
        {
            if(nums[i] > max)
            {
                max = nums[i];
            }
        }
        return max;
    }
}
