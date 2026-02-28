first bad version in a given range of versions.
import java.util.Scanner;
public class first_bad_version {
    public static int firstBadVersion(int n) {
        int left = 1;
        int right = n;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid; 
            } else {
                left = mid + 1; 
            }
        }

        return left; 
    }

    // Mock implementation of isBadVersion for testing
    private static boolean isBadVersion(int version) {
        // Assume versions 4 and above are bad
        return version >= 4;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total number of versions:");
        int n = scanner.nextInt();

        int badVersion = firstBadVersion(n);
        System.out.println("The first bad version is: " + badVersion);
    }
}