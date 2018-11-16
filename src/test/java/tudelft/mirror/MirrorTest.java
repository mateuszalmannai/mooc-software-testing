package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MirrorTest {

    private Mirror sut = new Mirror();

    @Test
    void test01() {

        assertThat(sut.mirrorEnds("abXYZba")).toString().equals("ab");
        assertThat(sut.mirrorEnds("abca")).toString().equals("a");
        assertThat(sut.mirrorEnds("aba")).toString().equals("aba");

    }
}
