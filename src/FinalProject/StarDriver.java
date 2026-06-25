package FinalProject;

public class StarDriver extends Driver {
    private int championBonus;

    public StarDriver(String name, String team, int speed, int cornering, int stability, int championBonus) {
        super(name, team, speed, cornering, stability);
        this.championBonus = championBonus;
    }

    @Override
    public String getDriverType() {
        return "스타 드라이버";
    }

    @Override
    public int calculateRaceScore() {
        return super.calculateRaceScore() + championBonus;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("챔피언 보너스: " + championBonus);
    }
}
