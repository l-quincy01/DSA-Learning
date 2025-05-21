package _DSA.Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        // output
        List<List<String>> result = new ArrayList<>();
        //map to store the group of anagrams
        HashMap<String, List<String>> map = new HashMap<>();

        //loop through each string in the input
        for (String str : strs) {
            //sort the string into alphabetical order and use that sorted string as a key to determine an anagra
            char[] charArr = str.toCharArray();
            Arrays.sort(charArr);
            String key = new String(charArr);

            //get the list at that specific key and add the string/anagram, if no list exists create a new empty list
            List<String> group = map.getOrDefault(key, new ArrayList<>());
            group.add(str);
            map.put(key, group);
        }

        //loop through every entry in the hashmap and take the value at each key(List stored at each Key) and add it to the result
        for (var entry : map.entrySet()) {

            List<String> val = new ArrayList<>();

            val.addAll(entry.getValue());

            result.add(val);

        }

        return result;

    }

    public static void main(String[] args) {

    }

}
