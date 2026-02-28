move zeroes to end of arrayimport java.util.Scanner;
public class move_zeros {
    public static void moveZeroes(int[] nums) {
        int nonZeroIndex = 0; // Pointer for the position of the next non-zero element

        // Move non-zero elements to the front
        for (int num : nums) {
            if (num != 0) {
                nums[nonZeroIndex] = num;
                nonZeroIndex++;
            }
        }

        // Fill the remaining positions with zeroes
        for (int i = nonZeroIndex; i < nums.length; i++) {
            nums[i] = 0;
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

        moveZeroes(nums);

        System.out.println("Array after moving zeroes to the end:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}