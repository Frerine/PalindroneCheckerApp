import java.util.Scanner;

public class UseCase10PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Normalize string (remove spaces and convert to lowercase)
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = normalized.length() - 1;

        boolean isPalindrome = true;

        // Two pointer comparison
        while(left < right) {
            if(normalized.charAt(left) != normalized.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }

        // Display result
        if(isPalindrome)
            System.out.println("The string is a Palindrome.");
        else
            System.out.println("The string is NOT a Palindrome.");

        sc.close();
    }
}