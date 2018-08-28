import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private final String firstPlayerName;
    private final String secondPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    private Map<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public Tennis(String firstPlayerName, String secondPlayerName) {
        this.firstPlayerName = firstPlayerName;
        this.secondPlayerName = secondPlayerName;
    }

    public String getScore() {
        return isDifferentScore()
                ? isReadyForGamePoint() ? gamePointScore() : lookupScore()
                : isDeuce() ? deuceScore() : sameScore();
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }

    private String gamePointScore() {
        return isAdv() ? advScore() : winScore();
    }

    private String winScore() {
        return advPlayer() + " Win";
    }

    private String advScore() {
        return advPlayer() + " Adv";
    }

    private String deuceScore() {
        return "Deuce";
    }

    private boolean isDeuce() {
        return firstPlayerScore >= 3;
    }

    private String sameScore() {
        return scoreLookup.get(firstPlayerScore) + " All";
    }

    private String lookupScore() {
        return scoreLookup.get(firstPlayerScore) + " " + scoreLookup.get(secondPlayerScore);
    }

    private boolean isDifferentScore() {
        return firstPlayerScore != secondPlayerScore;
    }

    private boolean isReadyForGamePoint() {
        return firstPlayerScore > 3 || secondPlayerScore > 3;
    }

    private String advPlayer() {
        return firstPlayerScore > secondPlayerScore ? firstPlayerName : secondPlayerName;
    }

    private boolean isAdv() {
        return Math.abs(firstPlayerScore - secondPlayerScore) == 1;
    }
}
