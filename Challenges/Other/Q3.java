package Other;

import java.util.*;

public class Q3 {

    public boolean areAlmostEqual(String s1, String s2) {

        // edge cases
        if (s1.length() != s2.length()) {
            return false; // if this passes then the lengths must be equal

                }if (s1.length() == 1) {
            return s1.charAt(0) == s2.charAt(0); // there is only 1 character to check
        }
        if (s1.length() == 2) {
            List<Character> lst = new ArrayList<>();

            lst.add(s1.charAt(0));
            lst.add(s1.charAt(1));

            for (int k = 0; k < s2.length(); k++) {

                if (!lst.contains(s2.charAt(k))) {
                    return false;
                }

            }

            return true;
        } // edge case to check if the strings are length of 2

        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        int outOfPlaceCount = 0; // can only be a max of 2
        // int[] swapIndicies =

        for (int i = 0; i < s1Arr.length; i++) {

            if (s1Arr[i] != s2Arr[i]) {
                outOfPlaceCount++;
            }

        }
        if (outOfPlaceCount > 2) {
            return false;
        }

        return true;
    }
}

/*
 * 
 * class Solution {
 * public boolean areAlmostEqual(String s1, String s2) {
 * 
 * //edge cases
 * if(s1.length() != s2.length()) return false ; // if this passes then the
 * lengths must be equal
 * if(s1.length() == 1 ) return s1.charAt(0) == s2.charAt(0) ; // there is only
 * 1 character to check
 * 
 * if(s1.length() == 2){
 * List<Character> lst = new ArrayList<>() ;
 * 
 * lst.add(s1.charAt(0));
 * lst.add(s1.charAt(1));
 * 
 * for(int k = 0; k < s2.length(); k++){
 * 
 * if( !lst.contains(s2.charAt(k)) ){
 * return false ;
 * }
 * 
 * }
 * 
 * return true ;
 * } // edge case to check if the strings are length of 2
 * 
 * 
 * char[] s1Arr = s1.toCharArray();
 * char[] s2Arr = s2.toCharArray();
 * 
 * int outOfPlaceCount = 0 ; // can only be a max of 2
 * //int[] swapIndicies =
 * 
 * 
 * for(int i = 0; i < s1Arr.length; i++){
 * 
 * if(s1Arr[i] != s2Arr[i]){
 * outOfPlaceCount++ ;
 * }
 * 
 * }
 * if(outOfPlaceCount > 2) return false ;
 * 
 * return true ;
 * }
 * }
 * 
 * 
 */
