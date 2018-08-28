import java.util.HashMap;
import java.util.Map;

public class Tennis {
    private int firstPlayerScore;

    private Map<Integer, String> scoreLookup = new HashMap<Integer, String>() {{
        put(1, "Fifteen");
        put(2, "Thirty");
    }};

    public String getScore() {
        if (firstPlayerScore > 0) {
            return scoreLookup.get(firstPlayerScore) + " Love";
        }

        return "Love All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
