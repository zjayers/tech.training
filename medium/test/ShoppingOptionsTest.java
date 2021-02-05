import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

class ShoppingOptionsTest {

    @Test
    @DisplayName("Should return the correct number of items that can be bought")
    void calculateCart_Success() {

        List<Integer> jeansPrice = List.of(2, 3);
        List<Integer> shoesPrice = List.of(4);
        List<Integer> skirtsPrice = List.of(2, 3);
        List<Integer> topsPrice = List.of(1, 2);

        int amountToSpend = 10;

        int solutions = ShoppingOptions.calculateCart(amountToSpend, jeansPrice, shoesPrice, skirtsPrice, topsPrice);
        Assertions.assertEquals(4, solutions);
    }
}