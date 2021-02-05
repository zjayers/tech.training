import java.util.List;

public class ShoppingOptions {

    private static int solutions = 0;

    @SafeVarargs
    public static int calculateCart(int amountToSpend, List<Integer>... prices) {
        // Split (or Loop) the prices into individual Lists
        // Start at List 1, item 1
        // Track down through the lists at item 1 until the last list is found
        // Try all combinations of the final List with (final List - 1)
        // after final List is exhausted, step back to (final List - 1) then to List Item 2, check this with all
        // contents of the final List as well. etc.
        // During the above process, count the number of final counts that sum to less than or equal to the
        // 'amountToSpend'
        backtrack(amountToSpend, prices, 0);

        // Finally, return the final count of sums that are less than the 'amountToSpend'.

        return solutions;
    }

    private static void backtrack(int amountToSpend, List<Integer>[] prices, int i) {
        if (amountToSpend < 0) return;

        if (i >= prices.length) {
            solutions++;
            return;
        }

        for (int price : prices[i]) {
            backtrack(amountToSpend - price, prices, i + 1);
        }
    }
}
