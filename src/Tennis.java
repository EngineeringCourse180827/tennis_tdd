import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;

    private Map<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(0, "Love");
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public String getScore() {
        if (firstPlayerScore != secondPlayerScore) {
            return scoreLookup.get(firstPlayerScore) + " " + scoreLookup.get(secondPlayerScore);
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
