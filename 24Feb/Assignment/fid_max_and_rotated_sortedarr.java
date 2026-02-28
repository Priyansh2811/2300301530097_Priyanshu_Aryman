find max and min in rotated sorted array
import java.util.Scanner;
public class fid_max_and_rotated_sortedarr {
    public static int findMax(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] > nums[right]) {
                left = mid + 1; // Max is in the right half
            } else {
                right = mid; // Max is in the left half
            }
        }

        return nums[left]; // The maximum element
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

        int maxElement = findMax(arr);
        System.out.println("The maximum element in the rotated sorted array is: " + maxElement);
    }
}