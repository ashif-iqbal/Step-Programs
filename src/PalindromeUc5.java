import java.util.Stack;

public class PalindromeUc5 {
    public static boolean isPalindrome(String str) {
        Stack<Character> stack = new Stack<>();

        // Push all characters
        for (char ch : str.toCharArray()) {
            stack.push(ch);
        }

        // Compare while popping
        for (char ch : str.toCharArray()) {
            if (ch != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println(isPalindrome(input)); // true
    }
}