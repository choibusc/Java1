package FinalProject;

import java.util.Arrays;

public class Race {
    private Driver[] drivers;

    public Race(Driver[] drivers) {
        this.drivers = drivers;
    }

    public void showDriverList() {
        System.out.println("===== F1 드라이버 목록 =====");

        for (int i = 0; i < drivers.length; i++) {
            System.out.println((i + 1) + ". "
                    + drivers[i].getName() + " / "
                    + drivers[i].getTeam() + " / "
                    + drivers[i].getDriverType());
        }
    }

    public void showDriverInfo(int index) {
        if (index < 0 || index >= drivers.length) {
            System.out.println("잘못된 번호입니다.");
            return;
        }

        System.out.println("===== 드라이버 정보 =====");
        drivers[index].showInfo();
    }

    public void startRace() {
        RaceResult[] results = new RaceResult[drivers.length];

        for (int i = 0; i < drivers.length; i++) {
            int score = drivers[i].calculateRaceScore();
            results[i] = new RaceResult(drivers[i], score);
        }

        Arrays.sort(results, (a, b) -> b.getScore() - a.getScore());

        System.out.println("===== F1 레이스 결과 =====");

        for (int i = 0; i < results.length; i++) {
            Driver driver = results[i].getDriver();

            System.out.println((i + 1) + "위: "
                    + driver.getName()
                    + " / " + driver.getTeam()
                    + " / 점수: " + results[i].getScore());
        }

        System.out.println("우승자: " + results[0].getDriver().getName());
    }
}
