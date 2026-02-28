import java.util.Scanner;
public class rev_integer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = scan.nextInt();
        int rev = 0;
        while (num > 0) {
            int rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        System.out.println("Reversed Number is: " + rev);
    }
}