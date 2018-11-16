package tudelft.chocolate;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChocolatePartitionsTest {

    private ChocolateBags sut = new ChocolateBags();

    @Test
    void totalIsTooBig() {
        // The total is higher than the amount of small and big bars
        // Meaning that there are not enough bars to produce the package
        assertThat(sut.calculate(1, 1, 10)).isEqualTo(-1);
    }

    @Test
    void onlyBigBars() {
        // We don't need small bars as using big bars is enough
        assertThat(sut.calculate(5, 3, 10)).isEqualTo(0);
    }

    @Test
    void bigAndSmallBars() {
        // Both big and small bars fit in the weight requirements
        assertThat(sut.calculate(5, 3, 17)).isEqualTo(2);
    }

    @Test
    void onlySmallBars() {
        // We can't use the big bars since they're 5kg each
        assertThat(sut.calculate(4, 2, 3)).isEqualTo(3);
    }

    @Test
    void bug() {
        assertThat(sut.calculate(2, 3, 17)).isEqualTo(2);
    }
}
