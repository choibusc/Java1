package FinalProject;

public class RaceResult {
    private Driver driver;
    private int score;

    public RaceResult(Driver driver, int score) {
        this.driver = driver;
        this.score = score;
    }

    public Driver getDriver() {
        return driver;
    }

    public int getScore() {
        return score;
    }
}
