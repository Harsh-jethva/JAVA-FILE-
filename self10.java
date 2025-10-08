/* Step 3 --> Easy --> 6/14 
Given an integer array nums and a non-negative integer k, rotate the array to the left by k steps.*/

import java.util.Scanner;

public class self10 {
    public static void rotateLeftByK(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;
        k = k % n;
        reverse(nums, 0, k - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, n - 1);
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
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

        System.out.println("Enter value of k:");
        int k = sc.nextInt();

        rotateLeftByK(nums, k);

        System.out.println("Array after rotating left by " + k + " steps:");
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }

        sc.close();
    }
}