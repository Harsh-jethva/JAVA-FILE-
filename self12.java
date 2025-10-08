/* Step 3 --> Easy --> 9/14 */
/*Given two sorted arrays nums1 and nums2, return an array that contains the union of these two arrays. 
The elements in the union must be in ascending order.
The union of two arrays is an array where all values are distinct and are present in either the first array, the second array, or both.
*/

import java.util.*;

public class self12 {
    public static int[] unionArrays(int[] nums1, int[] nums2) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int num : nums1) set.add(num);
        for (int num : nums2) set.add(num);

        int[] result = new int[set.size()];
        int i = 0;
        for (int val : set) {
            result[i++] = val;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter size of first array:");
        int n1 = sc.nextInt();
        int[] nums1 = new int[n1];
        System.out.println("Enter " + n1 + " integers in sorted order:");
        for (int i = 0; i < n1; i++) nums1[i] = sc.nextInt();

        System.out.println("Enter size of second array:");
        int n2 = sc.nextInt();
        int[] nums2 = new int[n2];
        System.out.println("Enter " + n2 + " integers in sorted order:");
        for (int i = 0; i < n2; i++) nums2[i] = sc.nextInt();

        int[] union = unionArrays(nums1, nums2);

        System.out.println("Union of the two arrays:");
        for (int val : union) {
            System.out.print(val + " ");
        }

        sc.close();
    }
}
