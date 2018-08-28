import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TennisTest {

    Tennis tennis = new Tennis();

    @Test
    public void love_all() {
        scoreShouldBe("Love All");
    }

    @Test
    public void fifteen_love() {
        tennis.firstPlayerScore();

        scoreShouldBe("Fifteen Love");
    }

    @Test
    public void thirty_love() {
        tennis.firstPlayerScore();
        tennis.firstPlayerScore();

        scoreShouldBe("Thirty Love");
    }

    private void scoreShouldBe(String expected) {
        assertEquals(expected, tennis.getScore());
    }

}
