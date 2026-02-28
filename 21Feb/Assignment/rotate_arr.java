rotate an array by k steps to the right, where k is non-negative.
import java.util.Scanner;
public class rotate_arr {
    public static void rotate(int[] nums, int k) {
        k = k % nums.length; // Handle cases where k is greater than array length
        reverse(nums, 0, nums.length - 1); // Reverse the entire array
        reverse(nums, 0, k - 1); // Reverse the first k elements
        reverse(nums, k, nums.length - 1); // Reverse the remaining elements
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
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        System.out.println("Enter the number of steps to rotate:");
        int k = scanner.nextInt();

        rotate(nums, k);

        System.out.println("Rotated array:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}