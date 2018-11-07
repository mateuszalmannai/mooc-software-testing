package tudelft.roman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RomanNumeralTestWithBeforeEach {

    private RomanNumeral roman;

    @BeforeEach
    public void initialize() {
        roman = new RomanNumeral();
    }

    @Test
    public void singleNumber() {
        assertEquals(1, roman.convert("I"));
    }

    @Test
    public void numberWithManyDigits() {
        assertEquals(8, roman.convert("VIII"));
    }

    @Test
    public void numberWithSubtractiveNotation() {
        assertEquals(4, roman.convert("IV"));
    }

    @Test
    public void numberWithAndWithoutSubtractiveNotation() {
        assertEquals(44, roman.convert("XLIV"));
    }
}
