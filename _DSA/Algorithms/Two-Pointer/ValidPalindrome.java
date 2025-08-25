
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        int pointer_A = 0;
        int pointer_B = s.length() - 1;
        String str = s.toLowerCase();

        while (pointer_A < pointer_B) {
            if (!Character.isLetterOrDigit(str.charAt(pointer_A))) {
                pointer_A++;
                continue;
            }
            if (!Character.isLetterOrDigit(str.charAt(pointer_B))) {
                pointer_B--;
                continue;
            }

            if (str.charAt(pointer_A) != str.charAt(pointer_B)) {
                return false;
            }

            pointer_A++;
            pointer_B--;
        }

        return true;
    }

    public static void main(String[] args) {

        {/* Tests ------------------------------------- */
        }
        ValidPalindrome vp = new ValidPalindrome();

        // Simple palindromes
        assert vp.isPalindrome("madam") : "madam should be palindrome";
        assert vp.isPalindrome("racecar") : "racecar should be palindrome";

        // Palindromes with spaces/case
        assert vp.isPalindrome("A man a plan a canal Panama") : "Phrase should be palindrome";
        assert vp.isPalindrome("No 'x' in Nixon") : "Phrase with punctuation should be palindrome";

        // Palindrome with punctuation
        assert vp.isPalindrome("Was it a car or a cat I saw?") : "Phrase should be palindrome";
        assert vp.isPalindrome("Able was I, ere I saw Elba!") : "Phrase should be palindrome";

        // Non-palindromes
        assert !vp.isPalindrome("hello") : "hello should NOT be palindrome";
        assert !vp.isPalindrome("palindrome") : "palindrome should NOT be palindrome";

        // Numbers
        assert vp.isPalindrome("12321") : "12321 should be palindrome";
        assert !vp.isPalindrome("12345") : "12345 should NOT be palindrome";

        // Edge cases
        assert vp.isPalindrome("") : "Empty string should be palindrome";
        assert vp.isPalindrome("a") : "Single char should be palindrome";

        // Only punctuation
        assert vp.isPalindrome(".,!?") : "Only punctuation should be palindrome";

        System.out.println("✅ All tests passed!");
    }

}
