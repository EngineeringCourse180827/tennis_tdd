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
        givenFirstPlayerScoreTimes(2);

        scoreShouldBe("Thirty Love");
    }

    private void givenFirstPlayerScoreTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.firstPlayerScore();
        }
    }

    private void scoreShouldBe(String expected) {
        assertEquals(expected, tennis.getScore());
    }

}
