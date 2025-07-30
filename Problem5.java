import java.util.Scanner;

public class Problem5 {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int reversed = 0;
        int original = x;

        while (x > reversed) {
            reversed = reversed * 10 + x % 10;
            x /= 10;
        }
        return x == reversed || x == reversed / 10;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPalindrome(num))
            System.out.println(num + " is a palindrome.");
        else
            System.out.println(num + " is not a palindrome.");

        sc.close();
    }
}
