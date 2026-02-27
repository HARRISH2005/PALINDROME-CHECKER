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
        boolean isPalindrome = true;

        for (int i = 0; i < input1.length() / 2; i++) {
            if (input1.charAt(i) != input1.charAt(input1.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println("UC2 Input String : " + input1);
        if (isPalindrome) {
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

        System.out.println("UC3 Original String : " + input2);
        System.out.println("Reversed String : " + reversed);

        if (input2.equals(reversed)) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println();


        // ===================== UC4 =====================
        String input3 = "radar";

        char[] characters = input3.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindromeUC4 = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindromeUC4 = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("UC4 Input String : " + input3);
        if (isPalindromeUC4) {
            System.out.println("Result : The string is a Palindrome.");
        } else {
            System.out.println("Result : The string is NOT a Palindrome.");
        }

        System.out.println("Program completed.");
    }
}