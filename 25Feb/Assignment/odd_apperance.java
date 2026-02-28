odd appearance in an array
import java.util.Scanner;
public class odd_apperance {
    public static int findOdd(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; 
        }
        return result; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scanner.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        int oddElement = findOdd(arr);
        System.out.println("The element that appears an odd number of times is: " + oddElement);
    }
}