public class Tennis {
    private int firstPlayerScore;

    public String getScore() {
        if (firstPlayerScore == 1) {
            return "Fifteen Love";
        }
        return "Love All";
    }

    public void firstPlayerScore() {
        firstPlayerScore++;
    }
}
