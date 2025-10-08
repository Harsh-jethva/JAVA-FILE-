/* Step 3 --> Easy --> 12/14 */
/*Given an array of nums of n integers. 
Every integer in the array appears twice except one integer. 
Find the number that appeared once in the array.*/
import java.util.Scanner;

public class self15 {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num; // XOR cancels out duplicate numbers
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = sc.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter " + n + " integers (where every number appears twice except one):");
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int unique = singleNumber(nums);

        System.out.println("The number that appeared once is: " + unique);

        sc.close();
    }
}