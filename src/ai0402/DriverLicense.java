package ai0402;

import java.util.Scanner;

public class DriverLicense {
    public static void main(String[] args) {
        Scanner s = new Scanner((System.in));
        System.out.println("---운전면허필기시험 합격여부 확인---");
        System.out.print("필기시험 점수 입력:");
        int score = s.nextInt();
        String result = ""; //empty String 비어있는 문자열

        if(score >= 70)
            result = "합격";
        else
            result = "불합격";

        System.out.printf("%d점 이므로 %s입니다.", score, result);

        s.close();
    }
}
