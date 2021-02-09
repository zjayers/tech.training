package Strings.Medium;

import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring {
    public static int find(String str) {
        return optimized_SlidingWindow(str);
    }

    private static int optimized_SlidingWindow(String str) {

        if (str.length() <= 1) return str.length();

        int leftPointer = 0;
        int rightPointer = 0;
        int longestSubstringLength = 0;

        HashMap<Character, Integer> seenCharacters = new HashMap<Character, Integer>();

        while (rightPointer < str.length()) {

            char currentChar = str.charAt(rightPointer);

            if (seenCharacters.containsKey(currentChar)) {
                int previouslySeenCharIndex = seenCharacters.get(currentChar);

                if (previouslySeenCharIndex >= leftPointer) {
                    leftPointer = previouslySeenCharIndex + 1;
                }
            }

            seenCharacters.put(currentChar, rightPointer);
            longestSubstringLength = Math.max(longestSubstringLength, rightPointer - leftPointer + 1);
            rightPointer++;
        }

        return longestSubstringLength;
    }

    private static int bruteForce(String str) {
        if (str.isEmpty()) return 0;

        ArrayList<String> foundSubStrings = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            char initialChar = str.charAt(i);
            String currentSubstring = String.valueOf(initialChar);

            for (int j = i + 1; j < str.length(); j++) {

                char nextCharacter = str.charAt(j);

                if (currentSubstring.contains(String.valueOf(nextCharacter))) {
                    foundSubStrings.add(currentSubstring);
                } else {
                    currentSubstring += nextCharacter;
                }
            }
        }

        foundSubStrings.sort((o1, o2) -> o2.length() - o1.length());
        return foundSubStrings.get(0).length();
    }
}
