package Arrays.Medium;

public class ContainerWithMostWater {

    /**
     * Parses an array of line heights and determines the largest possible area of lines that can be filled with
     * water without spilling.
     * <p>
     * This is a great example of solving a problem with "Two Shifting Pointers" approach
     *
     * @param lineHeights Heights of each individual line on the bar chart.
     * @return The area (length x width) of the largest fill-able area of lines.
     */
    public static int findContainer(int[] lineHeights) {

        int p1 = 0;
        int p2 = lineHeights.length - 1;
        int maxArea = 0;

        while (p1 < p2) {

            int height = Math.min(lineHeights[p1], lineHeights[p2]);
            int width = p2 - p1;
            int area = height * width;

            maxArea = Math.max(maxArea, area);

            if (lineHeights[p1] <= lineHeights[p2]) {
                p1++;
            } else {
                p2--;
            }

        }

        return maxArea;
    }

}
