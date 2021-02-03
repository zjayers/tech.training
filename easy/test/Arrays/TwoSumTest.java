package Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Two Sum")
class TwoSumTest {

    @Test
    @DisplayName("Should return the correct indices.")
    void TwoSum_CorrectOutput() {

        final int TARGET_FOR_SUCCESS = 9;
        final int[] INPUT_FOR_SUCCESS = new int[]{2, 7, 11, 15};
        final int[] SOLUTION_FOR_SUCCESS = new int[]{0, 1};

        int[] indices = TwoSum.findSum(INPUT_FOR_SUCCESS, TARGET_FOR_SUCCESS);
        Assertions.assertArrayEquals(SOLUTION_FOR_SUCCESS, indices);
    }

    @Test
    @DisplayName("Should return the first matching indices when multiple matches are passed in.")
    void TwoSum_CorrectOutputWithMultipleMatches() {

        final int TARGET_FOR_SUCCESS = 9;
        final int[] INPUT_FOR_SUCCESS = new int[]{2, 7, 2, 7, 11, 15};
        final int[] SOLUTION_FOR_SUCCESS = new int[]{0, 1};

        int[] indices = TwoSum.findSum(INPUT_FOR_SUCCESS, TARGET_FOR_SUCCESS);
        Assertions.assertArrayEquals(SOLUTION_FOR_SUCCESS, indices);
    }

    @Test
    @DisplayName("Should return null when no matching sum is found inside of array.")
    void TwoSum_ReturnNullOnFailure() {

        final int TARGET_FOR_FAILURE = 8;
        final int[] INPUT_FOR_FAILURE = new int[]{2, 7, 11, 15};

        int[] indices = TwoSum.findSum(INPUT_FOR_FAILURE, TARGET_FOR_FAILURE);
        Assertions.assertNull(indices);
    }

    @Test
    @DisplayName("Should return null when an empty array is passed in.")
    void TwoSum_ReturnNullOnEmptyArray() {

        final int TARGET_FOR_FAILURE = 8;
        final int[] INPUT_FOR_FAILURE = new int[0];

        int[] indices = TwoSum.findSum(INPUT_FOR_FAILURE, TARGET_FOR_FAILURE);
        Assertions.assertNull(indices);
    }

}