package tudelft.roman;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class RomanNumeralTest {


    private RomanNumeral roman = new RomanNumeral();

    @Test
    public void singleNumber() {
        assertEquals(1, roman.convert("I"));
        assertEquals(5, roman.convert("V"));

    }

    @Test
    public void numberWithManyDigits() {
        assertEquals(8, roman.convert("VIII"));
        assertEquals(3, roman.convert("III"));
        assertEquals(2, roman.convert("II"));
    }

    @Test
    public void numberWithSubtractiveNotation() {
        assertEquals(4, roman.convert("IV"));
        assertEquals(9, roman.convert("IX"));
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        assertEquals(44, roman.convert("XLIV"));
        assertEquals(19, roman.convert("XIX"));
    }

    @Test
    void invalidNumber() {
        validateRomanNumeral("VX");
        validateRomanNumeral("XXC");
    }

    private void validateRomanNumeral(String romanNumeral) {
        try {
            roman.convert(romanNumeral);
            fail("Expected Exception!");
        } catch (IllegalArgumentException e) {
            assertTrue(e.getMessage().contains("Invalid Roman Numeral"));
        }
    }
}
