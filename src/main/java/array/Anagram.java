package main.java.array;

import java.util.Arrays;

/**
 * @author Artem Esipovich 7/21/19
 */

public class Anagram {

    public static void main(String[] args) {
        System.out.println(areAnagrams("cat", "tca"));
        System.out.println(areAnagrams("restful", "fluster"));
        System.out.println(areAnagrams("modern", "omen"));
    }

    private static boolean areAnagrams(String first, String second) {
        if (first.length() != second.length()) {
            return false;
        }
        char firstLetters[] = first.toCharArray();
        char secondLetters[] = second.toCharArray();

        //O(NlogN)
        Arrays.sort(firstLetters);
        Arrays.sort(secondLetters);

        for (int i = 0; i < firstLetters.length; i++) {
            if (firstLetters[i] != secondLetters[i]) {
                return false;
            }
        }
        return true;
    }
}
