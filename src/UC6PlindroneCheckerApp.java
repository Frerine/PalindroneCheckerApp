import java.util.*;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase for uniform comparison
        input = input.toLowerCase();

        // Create Queue and Stack
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and Push characters
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            queue.add(ch);      // enqueue
            stack.push(ch);     // push
        }

        boolean isPalindrome = true;

        // Compare dequeue and pop
        while(!queue.isEmpty()) {
            char qChar = queue.remove();   // dequeue
            char sChar = stack.pop();      // pop

            if(qChar != sChar) {
                isPalindrome = false;
                break;
            }
        }

        // Display result
        if(isPalindrome) {
            System.out.println("The string is a Palindrome.");
        } else {
            System.out.println("The string is NOT a Palindrome.");
        }

        sc.close();
    }
}