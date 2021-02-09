package Arrays.Easy;

public class GreatestSum {
    public static int[] find(int[] numbers) {
        int leftPointer = 0;
        int rightPointer = 1;
        int largestSum = 0;
        int[] largestPair = new int[2];

        while (rightPointer < numbers.length) {
            int currentSum = numbers[leftPointer] + numbers[rightPointer];

            if (currentSum > largestSum) {
                largestSum = currentSum;
                largestPair[0] = numbers[leftPointer];
                largestPair[1] = numbers[rightPointer];
            }

            leftPointer++;
            rightPointer++;
        }

        return largestPair;

    }
}
