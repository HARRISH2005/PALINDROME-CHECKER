import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

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
        if (isPalindrome1) {
            System.out.println("Result : Palindrome");
        } else {
            System.out.println("Result : Not Palindrome");
        }
        System.out.println();


        // ===================== UC3 =====================
        String input2 = "level";
        String reversed = "";

        for (int i = input2.length() - 1; i >= 0; i--) {
            reversed = reversed + input2.charAt(i);
        }

        System.out.println("UC3 Input : " + input2);
        System.out.println("Reversed : " + reversed);

        if (input2.equals(reversed)) {
            System.out.println("Result : Palindrome");
        } else {
            System.out.println("Result : Not Palindrome");
        }
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
        if (isPalindrome3) {
            System.out.println("Result : Palindrome (Char Array)");
        } else {
            System.out.println("Result : Not Palindrome (Char Array)");
        }
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
        if (isPalindrome4) {
            System.out.println("Result : Palindrome (Stack)");
        } else {
            System.out.println("Result : Not Palindrome (Stack)");
        }
        System.out.println();


        // ===================== UC6 =====================
        String input5 = "civic";
        Stack<Character> stack2 = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < input5.length(); i++) {
            stack2.push(input5.charAt(i));
            queue.add(input5.charAt(i));
        }

        boolean isPalindrome5 = true;

        for (int i = 0; i < input5.length(); i++) {
            if (stack2.pop() != queue.remove()) {
                isPalindrome5 = false;
                break;
            }
        }

        System.out.println("UC6 Input : " + input5);
        if (isPalindrome5) {
            System.out.println("Result : Palindrome (Stack + Queue)");
        } else {
            System.out.println("Result : Not Palindrome (Stack + Queue)");
        }

        System.out.println("\nProgram completed successfully.");
    }
}