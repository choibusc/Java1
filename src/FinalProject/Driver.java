package FinalProject;

import java.util.Random;

public class Driver implements Raceable {
    private String name;
    private String team;
    private int speed;
    private int cornering;
    private int stability;

    public Driver(String name, String team, int speed, int cornering, int stability) {
        this.name = name;
        this.team = team;
        this.speed = speed;
        this.cornering = cornering;
        this.stability = stability;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public int getSpeed() {
        return speed;
    }

    public int getCornering() {
        return cornering;
    }

    public int getStability() {
        return stability;
    }

    public String getDriverType() {
        return "기본 드라이버";
    }

    public int getTotalAbility() {
        return speed + cornering + stability;
    }

    @Override
    public int calculateRaceScore() {
        Random random = new Random();
        int luck = random.nextInt(31);
        return getTotalAbility() + luck;
    }

    @Override
    public void showInfo() {
        System.out.println("이름: " + name);
        System.out.println("팀: " + team);
        System.out.println("유형: " + getDriverType());
        System.out.println("속도: " + speed);
        System.out.println("코너링: " + cornering);
        System.out.println("안정성: " + stability);
        System.out.println("총 능력치: " + getTotalAbility());
    }
}
