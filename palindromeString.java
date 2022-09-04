public class palindromeString {
    public static void main(String args[]) {
        String s = "abcba"; // Sample string for testing
        if (isPalindrome(s)) // If string is palindrom, print the statement
            System.out.println("Palindrome");

    }

    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder(); //Using StringBuilder instead of String for better time complexity

        for (int i = str.length() - 1; i >= 0; i--) { // Traverse string from end to beginning
            rev.append(str.charAt(i)); // append character at i index into rev
        }

        if (str.equals(rev.toString())) { // Convert StringBuilder rev to String and return true if equal to str else return false
            return true;
        } else {
            return false;
        }
    }
}