import java.util.Stack;

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

        System.out.println("Input String : " + input1);
        if (isPalindrome1) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println();


        // ===================== UC3 =====================
        String input2 = "level";
        String reversed = "";

        for (int i = input2.length() - 1; i >= 0; i--) {
            reversed = reversed + input2.charAt(i);
        }

        System.out.println("Original String : " + input2);
        System.out.println("Reversed String : " + reversed);

        if (input2.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
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

        System.out.println("Input String : " + input3);
        if (isPalindrome3) {
            System.out.println("Result : The string is a Palindrome (Using Char Array).");
        } else {
            System.out.println("Result : The string is NOT a Palindrome (Using Char Array).");
        }

        System.out.println();


        // ===================== UC5 =====================
        String input4 = "noon";
        Stack<Character> stack = new Stack<>();

        // Push characters into stack
        for (int i = 0; i < input4.length(); i++) {
            stack.push(input4.charAt(i));
        }

        boolean isPalindrome4 = true;

        // Pop and compare
        for (int i = 0; i < input4.length(); i++) {
            if (input4.charAt(i) != stack.pop()) {
                isPalindrome4 = false;
                break;
            }
        }

        System.out.println("Input String : " + input4);
        if (isPalindrome4) {
            System.out.println("Result : The string is a Palindrome (Using Stack).");
        } else {
            System.out.println("Result : The string is NOT a Palindrome (Using Stack).");
        }

        System.out.println("\nProgram completed.");
    }
}