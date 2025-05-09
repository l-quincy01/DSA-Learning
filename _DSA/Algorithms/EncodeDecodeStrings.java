
import java.util.*;

class EncodeDecodeStrings {

    public static String encode(List<String> strs) {

        StringBuilder str = new StringBuilder();

        for (String st : strs) {

            str.append(st.length()).append("#").append(st);
        }
        return str.toString();
    }

    // Decodes a single string to a list of strings.
    public static List<String> decode(String str) {
        List<String> lst = new ArrayList<String>();

        int i = 0;

        while (i < str.length()) {

            int j = i; // tracks the index to just before we reach a #
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j)); // get the encoded length

            i = j + 1; //skip the #
            lst.add(str.substring(i, i + length));
            i += length; // move pointer by the length of the encoded string

        }
        return lst;
    }

    public static void main(String[] args) {
        List<String> input = Arrays.asList("7#leet9#9#9#", "#4#code", "#123");
        String encoded = encode(input);
        List<String> decoded = decode(encoded);
        System.out.println(decoded); // [leet, code, 123]
    }
}
