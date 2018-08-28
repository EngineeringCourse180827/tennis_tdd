import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private final String firstPlayerName;
    private int firstPlayerScore;
    private int secondPlayerScore;

    private Map<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public Tennis(String firstPlayerName) {
        this.firstPlayerName = firstPlayerName;
    }

    public String getScore() {
        if (firstPlayerScore > 3) {
            if (firstPlayerScore - secondPlayerScore == 1) {
                return firstPlayerName + " Adv";
            }
        }

        if (firstPlayerScore != secondPlayerScore) {
            return scoreLookup.get(firstPlayerScore) + " " + scoreLookup.get(secondPlayerScore);
        }

        if (firstPlayerScore >= 3) {
            return "Deuce";
        }

        return scoreLookup.get(firstPlayerScore) + " All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
