import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Deque;
import java.util.ArrayDeque;

public class PalindromeChecker {

    public static void main(String[] args) {

        // ===================== UC1 =====================
        System.out.println("===========================================");
        System.out.println(" Welcome to the Palindrome Checker System ");
        System.out.println("===========================================");
        System.out.println("Version : 1.0");
        System.out.println("System initialized successfully.");
        System.out.println();
        System.out.println("Ready to proceed to next use case...");
        System.out.println();


        // ===================== UC2 =====================
        String input1 = "madam";
        boolean isPalindrome1 = true;

        for (int i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - 1 - i)) {
                isPalindrome1 = false;
                break;
            }
        }

        System.out.println("UC2 Input : " + input1);
        System.out.println(isPalindrome1 ? "Result : Palindrome" : "Result : Not Palindrome");
        System.out.println();


        // ===================== UC3 =====================
        String input2 = "level";
        String reversed = "";

        for (int i = input2.length() - 1; i >= 0; i--) {
            reversed = reversed + input2.charAt(i);
        }

        System.out.println("UC3 Input : " + input2);
        System.out.println("Reversed : " + reversed);
        System.out.println(input2.equals(reversed) ? "Result : Palindrome" : "Result : Not Palindrome");
        System.out.println();


        // ===================== UC4 =====================
        String input3 = "radar";
        char[] charArray = input3.toCharArray();

        int start = 0;
        int end = charArray.length - 1;
        boolean isPalindrome3 = true;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                isPalindrome3 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC4 Input : " + input3);
        System.out.println(isPalindrome3 ?
                "Result : Palindrome (Char Array)" :
                "Result : Not Palindrome (Char Array)");
        System.out.println();


        // ===================== UC5 =====================
        String input4 = "noon";
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input4.length(); i++) {
            stack.push(input4.charAt(i));
        }

        boolean isPalindrome4 = true;

        for (int i = 0; i < input4.length(); i++) {
            if (input4.charAt(i) != stack.pop()) {
                isPalindrome4 = false;
                break;
            }
        }

        System.out.println("UC5 Input : " + input4);
        System.out.println(isPalindrome4 ?
                "Result : Palindrome (Stack - LIFO)" :
                "Result : Not Palindrome (Stack - LIFO)");
        System.out.println();


        // ===================== UC6 =====================
        String input5 = "civic";
        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input5.length(); i++) {
            queue.add(input5.charAt(i));   // FIFO
            stack2.push(input5.charAt(i)); // LIFO
        }

        boolean isPalindrome5 = true;

        while (!queue.isEmpty() && !stack2.isEmpty()) {
            if (queue.remove() != stack2.pop()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("UC6 Input : " + input5);
        System.out.println(isPalindrome5 ?
                "Result : Palindrome (Queue FIFO vs Stack LIFO)" :
                "Result : Not Palindrome (Queue FIFO vs Stack LIFO)");
        System.out.println();


        // ===================== UC7 =====================
        // Deque-Based Optimized Palindrome Checker

        String input6 = "racecar";
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input6.length(); i++) {
            deque.addLast(input6.charAt(i));
        }

        boolean isPalindrome6 = true;

        // Remove first and last and compare
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome6 = false;
                break;
            }
        }

        System.out.println("UC7 Input : " + input6);
        System.out.println(isPalindrome6 ?
                "Result : Palindrome (Deque - Optimized)" :
                "Result : Not Palindrome (Deque - Optimized)");

        System.out.println("\nProgram completed successfully.");
    }
}