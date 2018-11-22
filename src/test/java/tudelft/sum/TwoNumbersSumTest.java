package tudelft.sum;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TwoNumbersSumTest {

    private TwoNumbersSum sut = new TwoNumbersSum();

    @Test
    void twoSinglePositiveIntegers() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(1), numberInList(2));
        assertThat(resultList.get(0)).isEqualTo(3);
    }

    @Test
    void twoDigitIntegers() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(1, 2), numberInList(4));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(6);
    }

    @Test
    void twoDigitIntegersWithSumTwelve() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(6), numberInList(6));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(2);
    }

    @Test
    void threeDigitIntegers() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(6, 6), numberInList(6, 6));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(3);
        assertThat(resultList.get(2)).isEqualTo(2);
    }

    @Test
    void twoDigitIntegersWithSumTen() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(5), numberInList(5));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(0);
    }

    @Test
    void twoDigitIntegersWithSumFourteen() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(7), numberInList(7));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(4);
    }

    @Test
    void twoDigitIntegersWithSumSixteen() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(8), numberInList(8));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(6);
    }

    @Test
    void twoDigitIntegersWithSumEighteen() {
        ArrayList<Integer> resultList = sut.addTwoNumbers(numberInList(9), numberInList(9));
        assertThat(resultList.get(0)).isEqualTo(1);
        assertThat(resultList.get(1)).isEqualTo(8);
    }


    private ArrayList<Integer> numberInList(int ... number) {
        ArrayList<Integer> result = new ArrayList();

        for (int i : number) {
            result.add(i);
        }
        return result;
    }
}
