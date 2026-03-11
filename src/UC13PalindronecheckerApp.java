import java.util.*;

public class UseCase13PalindromeCheckerApp {

    // Stack based palindrome check
    public static boolean stackPalindrome(String input) {

        Stack<Character> stack = new Stack<>();

        for(char c : input.toCharArray()) {
            stack.push(c);
        }

        for(char c : input.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }

    // Deque based palindrome check
    public static boolean dequePalindrome(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for(char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while(deque.size() > 1) {
            if(deque.removeFirst() != deque.removeLast())
                return false;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        // Measure Stack Algorithm Time
        long startStack = System.nanoTime();
        boolean stackResult = stackPalindrome(input);
        long endStack = System.nanoTime();

        // Measure Deque Algorithm Time
        long startDeque = System.nanoTime();
        boolean dequeResult = dequePalindrome(input);
        long endDeque = System.nanoTime();

        long stackTime = endStack - startStack;
        long dequeTime = endDeque - startDeque;

        System.out.println("\nResults:");
        System.out.println("Stack Palindrome Result: " + stackResult);
        System.out.println("Stack Execution Time: " + stackTime + " ns");

        System.out.println("Deque Palindrome Result: " + dequeResult);
        System.out.println("Deque Execution Time: " + dequeTime + " ns");

        sc.close();
    }
}