package com.hitms.lms;

/**
 * Utility methods for working with item prices.
 */
public final class PriceUtils {

    /** Private constructor to hide the default one. */
    private PriceUtils() {
    }

    /**
     * Returns the sum of a list of item prices.
     *
     * @param prices the item prices
     * @return the total of all prices
     */
    public static double total(final double[] prices) {
        double sum = 0;
        for (double price : prices) {
            sum += price; // accumulate running total
        }
        return sum;
    }

    /**
     * Returns the average of a list of item prices.
     *
     * @param prices the item prices
     * @return the mean price
     */
    public static double average(final double[] prices) {
        return total(prices) / prices.length;
    }
}
