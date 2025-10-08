/*Step 3 --> Easy --> 2/14
Problem statement : Given an array of integers nums, return the second-largest element in the array
If the second-largest element does not exist, return -1.
*/
import java.util.Scanner;

public class self5 {
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
        int secondLargest = findSecondLargest(nums);
        System.out.println("The second-largest element is: " + secondLargest);
        sc.close();
    }
    public static int findSecondLargest(int[] nums) {
        if (nums.length < 2) 
        {
            return -1;
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) 
        {
            if (num > first) 
            {
                second = first;
                first = num;
            } 
            else if (num > second && num != first) 
            {
                second = num;
            }
        }
        return (second == Integer.MIN_VALUE) ? -1 : second;
    }
}
