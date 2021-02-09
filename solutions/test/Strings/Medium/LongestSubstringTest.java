package Strings.Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class LongestSubstringTest {

    @Test
    @DisplayName("Should return the correct number of characters in the longest substring")
    void find_Success() {
        String INPUT = "abccabb";
        int SOLUTION = 3;

        int longestSubstringLength = LongestSubstring.find(INPUT);
        Assertions.assertEquals(SOLUTION, longestSubstringLength);
    }

    @Test
    @DisplayName("Should return the correct number of characters in the longest substring of a complex input")
    void find_SuccessComplex() {
        String INPUT = "abcbda";
        int SOLUTION = 4;

        int longestSubstringLength = LongestSubstring.find(INPUT);
        Assertions.assertEquals(SOLUTION, longestSubstringLength);
    }

    @Test
    @DisplayName("Should return the correct number of characters in a string consisting of identical chars")
    void find_IdenticalChars() {
        String INPUT = "ccccccccc";
        int SOLUTION = 1;

        int longestSubstringLength = LongestSubstring.find(INPUT);
        Assertions.assertEquals(SOLUTION, longestSubstringLength);
    }

    @Test
    @DisplayName("Should return 0 for an empty string")
    void find_EmptyString() {
        String INPUT = "";
        int SOLUTION = 0;

        int longestSubstringLength = LongestSubstring.find(INPUT);
        Assertions.assertEquals(SOLUTION, longestSubstringLength);
    }


}