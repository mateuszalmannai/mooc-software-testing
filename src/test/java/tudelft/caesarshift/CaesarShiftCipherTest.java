package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CaesarShiftCipherTest {


    private CaesarShiftCipher sut = new CaesarShiftCipher();

    @Test
    void test01() {
        assertThat(sut.CaesarShiftCipher("abc", 3)).isEqualTo("def");
    }

    @Test
    void test02() {
        assertThat(sut.CaesarShiftCipher("xyz", 3)).isEqualTo("abc");
    }
}
