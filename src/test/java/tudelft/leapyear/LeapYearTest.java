package tudelft.leapyear;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearTest {

    private LeapYear systemUnderTest = new LeapYear();

    /**
     * First Partition: Numbers divisible by 4 and not divisible by 100
     */
    @Test
    public void leapYearsThatAreNonCenturialYears() {
        assertTrue(systemUnderTest.isLeapYear(2016));
        assertTrue(systemUnderTest.isLeapYear(2020));
    }

    /**
     * Second Partition: Divisible by 4, divisible by 100, but also divisible by 400
     */
    @Test
    public void leapCenturialYears() {
        assertTrue(systemUnderTest.isLeapYear(2000));
    }

    /**
     * Third Partition: Not divisible by 4
     */
    @Test
    public void nonLeapYears() {
        // Not divisible by 4
        assertFalse(systemUnderTest.isLeapYear(2015));
        assertFalse(systemUnderTest.isLeapYear(2017));

        // Divisible by 4, divisible by 100, but not divisible by 400
        assertFalse(systemUnderTest.isLeapYear(1500));
        assertFalse(systemUnderTest.isLeapYear(1900));
    }

    /**
     * Fourth Partition: divisible by 4, divisible by 100, but not divisible by 400
     */
    @Test
    public void nonLeapCenturialYears() {
        assertFalse(systemUnderTest.isLeapYear(1500));
        assertFalse(systemUnderTest.isLeapYear(1900));
    }
}
