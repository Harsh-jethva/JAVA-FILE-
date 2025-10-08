/* Step 3 --> Easy --> 4/14
Given an integer array nums sorted in non-decreasing order, remove all duplicates in-place so that each unique element appears only once. Return the number of unique elements in the array. If the number of unique elements be k, then, Change the array nums such that the first k elements of nums contain the unique values in the order that they were present originally.
The remaining elements, as well as the size of the array does not matter in terms of correctness. An array sorted in non-decreasing order is an array where every element to the right of an element is either equal to or greater in value than that element.*/

import java.util.Scanner;

public class self8 {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[k - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }
        int k = removeDuplicates(nums);
        System.out.println(k);
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
        sc.close();
    }
}