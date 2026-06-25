package FinalProject;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Driver[] drivers = {
                new StarDriver("Max Verstappen", "Red Bull Racing", 98, 95, 93, 15),
                new StarDriver("Lewis Hamilton", "Ferrari", 94, 93, 91, 12),
                new StarDriver("Charles Leclerc", "Ferrari", 93, 94, 88, 10),
                new Driver("Lando Norris", "McLaren", 92, 91, 89),
                new Driver("George Russell", "Mercedes", 90, 89, 90),
                new RookieDriver("Rookie Kim", "Korea GP Team", 82, 80, 76, 15),
                new RookieDriver("Rookie Park", "Seoul Racing Team", 80, 78, 75, 18)
        };

        Race race = new Race(drivers);

        while (true) {
            System.out.println();
            System.out.println("===== F1 레이스 시뮬레이터 =====");
            System.out.println("1. 드라이버 목록 보기");
            System.out.println("2. 드라이버 정보 보기");
            System.out.println("3. 레이스 시작");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");

            int menu = scanner.nextInt();

            if (menu == 1) {
                race.showDriverList();
            } else if (menu == 2) {
                race.showDriverList();
                System.out.print("정보를 볼 드라이버 번호 선택: ");
                int number = scanner.nextInt();
                race.showDriverInfo(number - 1);
            } else if (menu == 3) {
                race.startRace();
            } else if (menu == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못된 메뉴입니다.");
            }
        }

        scanner.close();
    }
}