public class palindromeString {
    public static void main(String args[]) {
        String s = "abcba";
        if (isPalindrome(s))
            System.out.println("Palindrome");

    }

    public static boolean isPalindrome(String str) {
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        if (str.equals(rev.toString())) {
            return true;
        } else {
            return false;
        }
    }
}