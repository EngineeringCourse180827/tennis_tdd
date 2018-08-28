import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private int firstPlayerScore;
    private int secondPlayerScore;

    private Map<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(1, "Fifteen");
        put(2, "Thirty");
        put(3, "Forty");
    }};

    public String getScore() {
        if (secondPlayerScore == 1) {
            return "Love Fifteen";
        }
        
        if (firstPlayerScore > 0) {
            return scoreLookup.get(firstPlayerScore) + " Love";
        }

        return "Love All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }

    public void secondPlayerScore() {
        secondPlayerScore++;
    }
}
