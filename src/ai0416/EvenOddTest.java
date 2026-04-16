package ai0416;
import java.util.Scanner;
public class EvenOddTest {
    public static void main(String[] args) {
        System.out.println("===== 짝수 홀수 판별 프로그램 =====");

        System.out.print("정수를 입력==> ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        String result = "";

        if(num % 2 == 0)
            result = "짝수";
        else
            result = "홀수";

        System.out.printf("입력된 정수 %d는 %s입니다.\n", num, result);

        System.out.printf("프로그램종료!");

        s.close();
    }
}
