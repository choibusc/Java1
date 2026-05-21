package MidtermProject;
import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int movieChoice;
        int personCount;
        int ticketType;
        int price = 0;
        int totalPrice;

        String movieName = "";
        String ticketName = "";

        System.out.println("================================");
        System.out.println("        영화 예매 프로그램");
        System.out.println("================================");

        System.out.println("예매할 영화를 선택하세요.");
        System.out.println("1. 군체");
        System.out.println("2. 탑건2");
        System.out.println("3. 오디세이");
        System.out.println("4. 스파이더맨");
        System.out.print("영화 번호 입력: ");
        movieChoice = sc.nextInt();

        switch (movieChoice) {
            case 1:
                movieName = "군체";
                break;
            case 2:
                movieName = "탑건2";
                break;
            case 3:
                movieName = "오디세이";
                break;
            case 4:
                movieName = "스파이더맨";
                break;
            default:
                System.out.println("잘못된 영화 번호입니다.");
                sc.close();
                return;
        }

        System.out.println();
        System.out.println("관람권 종류를 선택하세요.");
        System.out.println("1. 성인 - 15000원");
        System.out.println("2. 청소년 - 12000원");
        System.out.println("3. 어린이 - 9000원");
        System.out.print("관람권 번호 입력: ");
        ticketType = sc.nextInt();

        switch (ticketType) {
            case 1:
                ticketName = "성인";
                price = 15000;
                break;
            case 2:
                ticketName = "청소년";
                price = 12000;
                break;
            case 3:
                ticketName = "어린이";
                price = 9000;
                break;
            default:
                System.out.println("잘못된 관람권 번호입니다.");
                sc.close();
                return;
        }

        System.out.print("예매 인원 수 입력: ");
        personCount = sc.nextInt();

        if (personCount <= 0) {
            System.out.println("인원 수는 1명 이상 입력해야 합니다.");
            sc.close();
            return;
        }

        totalPrice = price * personCount;

        System.out.println();
        System.out.println("================================");
        System.out.println("          예매 결과");
        System.out.println("================================");
        System.out.println("선택한 영화: " + movieName);
        System.out.println("관람권 종류: " + ticketName);
        System.out.println("1인 가격: " + price + "원");
        System.out.println("예매 인원: " + personCount + "명");
        System.out.println("--------------------------------");
        System.out.println("총 결제 금액: " + totalPrice + "원");
        System.out.println("================================");
        System.out.println("예매가 완료되었습니다.");

        sc.close();
    }
}
