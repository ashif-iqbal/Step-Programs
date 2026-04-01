import java.util.*;

public class PalindromeUc7 {

    public static void main(String[] args) {
        String input = "madam";

        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Step 1: Add characters
        for (char ch : input.toCharArray()) {
            queue.add(ch);   // Enqueue (FIFO)
            stack.push(ch);  // Push (LIFO)
        }

        // Step 2: Compare dequeue vs pop
        boolean isPalindrome = true;

        while (!queue.isEmpty()) {
            char fromQueue = queue.remove(); // FIFO
            char fromStack = stack.pop();    // LIFO

            if (fromQueue != fromStack) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}