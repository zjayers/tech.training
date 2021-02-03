package Arrays;

import java.util.HashMap;

public class TwoSum {

    public static int[] findSum(int[] nums, int target) {
        var seenValues = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {

            var currentNum = nums[i];
            var complement = target - currentNum;

            if (seenValues.containsKey(complement)) {
                return new int[]{seenValues.get(complement), i};
            }

            seenValues.put(currentNum, i);
        }

        return null;
    }

}
