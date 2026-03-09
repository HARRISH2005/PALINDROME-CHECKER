import java.util.Stack;
import java.util.ArrayDeque;
import java.util.Deque;

public class PalindromeChecker {

    // Method 1: Two Pointer Approach
    public static boolean twoPointerCheck(String input) {
        int start = 0;
        int end = input.length() - 1;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Stack Approach
    public static boolean stackCheck(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    // Method 3: Deque Approach
    public static boolean dequeCheck(String input) {

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "PalindromeChecker";

        // Two Pointer timing
        long start1 = System.nanoTime();
        boolean result1 = twoPointerCheck(input);
        long end1 = System.nanoTime();

        // Stack timing
        long start2 = System.nanoTime();
        boolean result2 = stackCheck(input);
        long end2 = System.nanoTime();

        // Deque timing
        long start3 = System.nanoTime();
        boolean result3 = dequeCheck(input);
        long end3 = System.nanoTime();

        System.out.println("Input : " + input);

        System.out.println("\nTwo Pointer Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("\nStack Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");

        System.out.println("\nDeque Result : " + result3);
        System.out.println("Execution Time : " + (end3 - start3) + " ns");
    }
}