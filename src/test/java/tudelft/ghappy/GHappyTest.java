package tudelft.ghappy;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GHappyTest {

    private GHappy sut = new GHappy();

    @Test
    void test() {
        assertThat(sut.gHappy("xxggxx")).isEqualTo(true);

        assertThat(sut.gHappy("xxgxx")).isEqualTo(false);
        assertThat(sut.gHappy("xxggyygxx")).isEqualTo(false);
    }

    @Test
    void failure() {
        assertThat(sut.gHappy("ggxx")).isEqualTo(true);
    }
}
