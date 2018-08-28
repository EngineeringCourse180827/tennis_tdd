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

    @Test
    public void forty_love() {
        givenFirstPlayerScoreTimes(3);

        scoreShouldBe("Forty Love");
    }

    @Test
    public void love_fifteen() {
        tennis.secondPlayerScore();

        scoreShouldBe("Love Fifteen");
    }

    @Test
    public void love_thirty() {
        givenSecondPlayerScoreTimes(2);

        scoreShouldBe("Love Thirty");
    }

    @Test
    public void fifteen_all() {
        tennis.firstPlayerScore();
        tennis.secondPlayerScore();

        scoreShouldBe("Fifteen All");
    }

    @Test
    public void thirty_all() {
        givenFirstPlayerScoreTimes(2);
        givenSecondPlayerScoreTimes(2);

        scoreShouldBe("Thirty All");
    }

    @Test
    public void deuce() {
        givenFirstPlayerScoreTimes(3);
        givenSecondPlayerScoreTimes(3);

        scoreShouldBe("Deuce");
    }

    private void givenFirstPlayerScoreTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.firstPlayerScore();
        }
    }

    private void givenSecondPlayerScoreTimes(int times) {
        for (int i = 0; i < times; i++) {
            tennis.secondPlayerScore();
        }
    }

    private void scoreShouldBe(String expected) {
        assertEquals(expected, tennis.getScore());
    }

}
