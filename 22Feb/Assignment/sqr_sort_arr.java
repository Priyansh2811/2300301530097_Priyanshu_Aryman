sqare of sorted arrayimport java.util.Scanner;
public class sqr_sort_arr {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[index--] = nums[left] * nums[left];
                left++;
            } else {
                result[index--] = nums[right] * nums[right];
                right--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array (sorted):");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int[] squaredSortedArray = sortedSquares(nums);
        System.out.println("Squared and sorted array:");
        for (int num : squaredSortedArray) {
            System.out.print(num + " ");
        }
    }
}