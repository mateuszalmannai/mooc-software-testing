package tudelft.chocolate;

public class ChocolateBags {

    public static final int BIG_BAR_WEIGHT = 5;
    public static final int ERROR_CONDITION = -1;

    /**
     * A package can store a different number of kilos, i.e. 1kg, 5kg, 10kg
     * The package can be filled with two types of bars: small bars of 1kg or big bars of 5kg
     * Given the total number of kilos required in a package the program should return the number of
     * small bars to be used
     * We should always use the maximum number of big bars before using small bars or return -1 if there
     * is no solution
     * @param smallBars
     * @param bigBars
     * @param totalWeight
     * @return
     */
    public int calculate(int smallBars, int bigBars, int totalWeight) {

        int maxBigBars = totalWeight / BIG_BAR_WEIGHT;

        int boxCount = maxBigBars < bigBars ? maxBigBars : bigBars;

        totalWeight -= (boxCount * BIG_BAR_WEIGHT);

        if(smallBars < totalWeight) return ERROR_CONDITION;

        return totalWeight;

    }

}
