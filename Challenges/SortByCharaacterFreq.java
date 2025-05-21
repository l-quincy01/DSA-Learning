
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class SortByCharaacterFreq {

    public String frequencySort(String s) {

        HashMap<Character, Integer> map_s = new HashMap<>();
        StringBuilder result = new StringBuilder();

        int highestFreq = 0;
        //store the character as a key and its freq as a value
        //build a string using the chacters/keys of highest value/frequency going down to lowest. 

        for (Character ch : s.toCharArray()) {
            map_s.put(ch, map_s.getOrDefault(ch, 0) + 1);
        }

        List<Map.Entry<Character, Integer>> sortedEntries = map_s.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList());

        for (Map.Entry<Character, Integer> entry : sortedEntries) {
            for (int j = 0; j < entry.getValue(); j++) {
                result.append(entry.getKey());
            }
        }

        return result.reverse().toString();
    }

}
