find the minimum element in a rotated sorted array
import java.util.Scanner;
public class fin_min {
    public static int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // Min is in the right half
            } else {
                right = mid; // Min is in the left half
            }
        }

        return nums[left]; // The minimum element
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the rotated sorted array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int minElement = findMin(arr);
        System.out.println("The minimum element in the rotated sorted array is: " + minElement);
    }
}