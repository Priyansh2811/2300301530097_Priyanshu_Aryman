public class first_last_pos {
    public static int[] searchRange(int[] nums, int target) {
        int[] result = {-1, -1}; // Default result if target is not found

        // Find the first occurrence of the target
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (left < nums.length && nums[left] == target) {
            result[0] = left; // First occurrence found
        }

        // Find the last occurrence of the target
        left = 0;
        right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] <= target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (right >= 0 && nums[right] == target) {
            result[1] = right; // Last occurrence found
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

        System.out.println("Enter the target element:");
        int target = scanner.nextInt();

        int[] positions = searchRange(nums, target);
        System.out.println("First and last positions of the target element: [" + positions[0] + ", " + positions[1] + "]");
    }
}