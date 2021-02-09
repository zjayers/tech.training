package Arrays.Hard;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Trapping Rain Water")
class TrappingRainWaterTest {

    @Test
    @DisplayName("Should return the correct solution for a simple array")
    void trappingRainWater_SimpleArray() {
        final int[] INPUT_ARRAY = new int[]{0, 1, 0, 2, 1, 0, 3, 1, 0, 1, 2};
        final int SOLUTION = 8;

        int area = TrappingRainWater.findContainer(INPUT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @Test
    @DisplayName("Should return the correct solution for a complex array")
    void trappingRainWater_ComplexArray() {
        final int[] INPUT_ARRAY = new int[]{5, 0, 3, 0, 0, 0, 2, 3, 4, 2, 1};
        final int SOLUTION = 20;

        int area = TrappingRainWater.findContainer(INPUT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @Test
    @DisplayName("Should return 0 if no empty areas are available")
    void trappingRainWater_NoArea() {
        final int[] INPUT_ARRAY = new int[]{3, 4, 3};
        final int SOLUTION = 0;

        int area = TrappingRainWater.findContainer(INPUT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @DisplayName("Should return 0 if input array is empty")
    @Test
    void findContainer_EmptyArray() {
        final int[] INPUT_ARRAY = new int[0];
        final int SOLUTION = 0;

        int area = TrappingRainWater.findContainer(INPUT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @Test
    @DisplayName("Should return 0 if array has only one element")
    void findContainer_ArrayWithOneElement() {
        final int[] INPUT_ARRAY = new int[]{1};
        final int SOLUTION = 0;

        int area = TrappingRainWater.findContainer(INPUT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

}