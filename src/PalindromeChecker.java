public class PalindromeChecker {

    public static void main(String[] args) {

        // Define the input string
        String input = "A man a plan a cannon panama";

        // Normalize the string: remove spaces and convert to lowercase
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

        boolean isPalindrome = true;

        int start = 0;
        int end = normalized.length() - 1;

        // Compare characters from start and end
        while (start < end) {

            if (normalized.charAt(start) != normalized.charAt(end)) {
                isPalindrome = false;
                break;
            }

            start++;
            end--;
        }

        // Output result
        System.out.println("Input : " + input);
        System.out.println("Normalized : " + normalized);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}