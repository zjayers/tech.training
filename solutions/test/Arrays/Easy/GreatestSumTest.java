package Arrays.Easy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class GreatestSumTest {

    @Test
    @DisplayName("Should find the pair with the greatest sum")
    void find_Success() {
        int[] INPUT = new int[]{1, 3, 7, 9, 2, 4};
        int[] SOLUTION = new int[]{7, 9};

        int[] result = GreatestSum.find(INPUT);
        Assertions.assertArrayEquals(SOLUTION, result);
    }
}