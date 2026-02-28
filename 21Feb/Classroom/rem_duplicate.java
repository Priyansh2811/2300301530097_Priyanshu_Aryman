
import java.util.Scanner;
public class rem_duplicate {
    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int k = 1; // Start from the second element

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i]; // Move unique element to the front
                k++;
            }
        }

        return k; // Return the number of unique elements
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

        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
        System.out.print("Unique elements: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}

