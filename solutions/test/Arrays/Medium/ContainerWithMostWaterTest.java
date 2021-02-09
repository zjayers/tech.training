package Arrays.Medium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Container With Most Water")
class ContainerWithMostWaterTest {

    @Test
    @DisplayName("Should return the correct solution with a simple array")
    void findContainer_SimpleArraySuccess() {

        final int[] LINE_HEIGHT_ARRAY = new int[]{7, 1, 2, 3, 9};
        final int SOLUTION = 28;

        int area = ContainerWithMostWater.findContainer(LINE_HEIGHT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);

    }

    @Test
    @DisplayName("Should return the correct solution with a complex array")
    void findContainer_ComplexArraySuccess() {
        final int[] LINE_HEIGHT_ARRAY = new int[]{6, 9, 3, 4, 5, 8};
        final int SOLUTION = 32;

        int area = ContainerWithMostWater.findContainer(LINE_HEIGHT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @DisplayName("Should return 0 if input array is empty")
    @Test
    void findContainer_EmptyArray() {
        final int[] LINE_HEIGHT_ARRAY = new int[0];
        final int SOLUTION = 0;

        int area = ContainerWithMostWater.findContainer(LINE_HEIGHT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

    @Test
    @DisplayName("Should return 0 if array has only one element")
    void findContainer_ArrayWithOneElement() {
        final int[] LINE_HEIGHT_ARRAY = new int[]{1};
        final int SOLUTION = 0;

        int area = ContainerWithMostWater.findContainer(LINE_HEIGHT_ARRAY);
        Assertions.assertEquals(SOLUTION, area);
    }

}