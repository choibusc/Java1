package FinalProject;

import java.util.Random;

public class RookieDriver extends Driver {
    private int mistakeRate;

    public RookieDriver(String name, String team, int speed, int cornering, int stability, int mistakeRate) {
        super(name, team, speed, cornering, stability);
        this.mistakeRate = mistakeRate;
    }

    @Override
    public String getDriverType() {
        return "신인 드라이버";
    }

    @Override
    public int calculateRaceScore() {
        Random random = new Random();
        int mistakePenalty = random.nextInt(mistakeRate + 1);
        return super.calculateRaceScore() - mistakePenalty;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("실수 위험도: " + mistakeRate);
    }
}
