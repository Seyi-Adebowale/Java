class Palindrome {
    public static void main(String[] args) {
        String testString = "civic";
        if (isPalindrome(testString)) {
            System.out.println(testString + " is a palindrome.");
        } else {
            System.out.println(testString + " is not a palindrome.");
        }
    }

    public static boolean isPalindrome(String str) {
        return isPalindromeChecker(str, 0, str.length() - 1);
    }

    public static boolean isPalindromeChecker(String str, int start, int end) {
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        if (start >= end) {
            return true;
        }
        return isPalindromeChecker(str, start + 1, end - 1);
    }
}
