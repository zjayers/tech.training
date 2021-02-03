package Strings;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Typed Out Strings")
class TypedOutStringsTest {

    @Test
    @DisplayName("Should correctly remove hashes and return true for equal strings")
    void compare() {
        String INPUT_A = "cb#d";
        String INPUT_B = "cd";

        boolean result = TypedOutStrings.compare(INPUT_A, INPUT_B);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should correctly remove multiple hashes and return true for equal strings")
    void compare_MultipleHashes() {
        String INPUT_A = "cb###d";
        String INPUT_B = "c##d";

        boolean result = TypedOutStrings.compare(INPUT_A, INPUT_B);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return empty strings if strings contain only hashes")
    void compare_OnlyHashes() {
        String INPUT_A = "#########";
        String INPUT_B = "###";

        boolean result = TypedOutStrings.compare(INPUT_A, INPUT_B);
        Assertions.assertTrue(result);
    }

    @Test
    @DisplayName("Should return false for non matching strings")
    void compare_NonMatching() {
        String INPUT_A = "abc#d";
        String INPUT_B = "abc#c";

        boolean result = TypedOutStrings.compare(INPUT_A, INPUT_B);
        Assertions.assertFalse(result);
    }
}