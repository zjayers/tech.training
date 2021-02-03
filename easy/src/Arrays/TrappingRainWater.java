package Arrays;

public class TrappingRainWater {

    /**
     * Formula: currentWater = min(MaxLeft, MaxRight) - currentHeight
     * <p>
     * Method: "Two Pointer Method" - Move pointers from left and right, and do logic based on each individual block
     * (If block size is greater than max, set the new size as max, if not, add the water blocks to the total)
     *
     * @param heights Heights of each individual block on the bar chart.
     * @return The max number of blocks that can be filled with water without spilling
     */
    public static int findContainer(int[] heights) {
        int total = 0;
        int maxLeft = 0;
        int maxRight = 0;

        int leftPointer = 0;
        int rightPointer = heights.length - 1;

        while (leftPointer < rightPointer) {

            int leftPointerVal = heights[leftPointer];
            int rightPointerVal = heights[rightPointer];

            if (leftPointerVal < rightPointerVal) {

                if (leftPointerVal >= maxLeft) {
                    maxLeft = leftPointerVal;
                } else {
                    total += maxLeft - leftPointerVal;
                }

                leftPointer++;

            } else {

                if (rightPointerVal >= maxRight) {
                    maxRight = rightPointerVal;
                } else {
                    total += maxRight - rightPointerVal;
                }

                rightPointer--;
            }
        }

        return total;
    }
}
