import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    @Test
    public void love_all() {
        Tennis tennis = new Tennis();

        assertEquals("Love All", tennis.getScore());
    }
}
