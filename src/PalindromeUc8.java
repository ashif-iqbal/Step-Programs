import java.util.*;

public class PalindromeUc8 {

    public static void main(String[] args) {
        String input = "madam";

        Deque<Character> deque = new ArrayDeque<>();

        // Step 1: Insert characters
        for (char ch : input.toCharArray()) {
            deque.addLast(ch); // insert at rear
        }

        // Step 2: Compare front & rear
        boolean isPalindrome = true;

        while (deque.size() > 1) {
            char front = deque.removeFirst(); // front
            char rear = deque.removeLast();   // rear

            if (front != rear) {
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