take arr and query then print prefix sum arr takeing input from user and print prefix sum array and also print prefix sum at given index in query.
import java.util.Scanner;
public class Prefix_sum_array {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scan.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        int[] prefixSum = new int[size];
        prefixSum[0] = arr[0];
        for (int i = 1; i < size; i++) {
            prefixSum[i] = prefixSum[i - 1] + arr[i];
        }
        
        System.out.println("Prefix Sum Array: ");
        for (int i = 0; i < size; i++) {
            System.out.print(prefixSum[i] + " ");
        }
        
        System.out.print("\nEnter the index to query prefix sum: ");
        int queryIndex = scan.nextInt();
        
        if (queryIndex >= 0 && queryIndex < size) {
            System.out.println("Prefix sum at index " + queryIndex + ": " + prefixSum[queryIndex]);
        } else {
            System.out.println("Invalid index. Please enter an index between 0 and " + (size - 1));
        }
    }
}
    