
public class AmazonPasswordPolicy {

    public static String isSimilar(String newPass, String oldPass) {

        int newPass_pointer = 0;
        int oldPass_pointer = 0;

        while (newPass_pointer < newPass.length() && oldPass_pointer < oldPass.length()) {

            char newPassChar = newPass.charAt(newPass_pointer);
            char oldPassChar = oldPass.charAt(oldPass_pointer); // ✅ fixed

            // ✅ Correct cyclic shift
            char nextChar_For_NewPassChar = (char) (((newPassChar - 'a' + 1) % 26) + 'a');

            if (newPassChar == oldPassChar || nextChar_For_NewPassChar == oldPassChar) {
                oldPass_pointer++; // Match found
            }

            newPass_pointer++; // Always move newPass pointer
        }

        return oldPass_pointer == oldPass.length() ? "YES" : "NO";
    }

    public static void main(String[] args) {

        String[] newPasswords = {"acd", "xyz", "abcd"};
        String[] oldPasswords = {"abce", "yza", "bddhdhdhf"};

        for (int i = 0; i < newPasswords.length; i++) {
            System.out.println(isSimilar(newPasswords[i], oldPasswords[i]));
        }

    }

}
