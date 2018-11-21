package tudelft.countletters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().countWordsThatEndInSorR("cats|dogs");
        assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().countWordsThatEndInSorR("cats|dog");
        assertEquals(1, words);
    }

    @Test
    void matchWordThatEndsInR() {
        int wordCount = new CountLetters().countWordsThatEndInSorR("car|blur");
        assertEquals(2, wordCount);
    }
}