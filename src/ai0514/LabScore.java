package ai0514;
import java.util.Scanner;

public class LabScore {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int computer;
        int user;

        // 컴퓨터 숫자 생성 (1~5)
        computer = (int)(Math.random() * 5) + 1;

        for (int i = 1; i <= 10; i++) {

            System.out.print("게임 " + i + "회 : 숫자 입력(1~5) ==> ");
            user = s.nextInt();

            if (user == computer) {
                System.out.println("맞췄네요. 축하합니다!!");
                break;
            }
            else {
                System.out.println("아까워요. 다시 해보세요.");
            }

            // 10번 다 실패했을 때
            if (i == 10) {
                System.out.println("실패! 정답은 " + computer + "였습니다.");
            }
        }

        System.out.println("게임을 마칩니다.");
    }
}
