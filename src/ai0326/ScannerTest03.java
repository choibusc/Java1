package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("=== BMI 계산 ===");

        //  이름 입력
        System.out.print("성명 입력 : ");
        String name = s.nextLine();

        //  몸무게 입력
        System.out.print("몸무게를 입력하세요. (kg): ");
        double weight = s.nextDouble();

        //  키 입력
        System.out.print("키를 입력하세요. (cm): ");
        double height = s.nextDouble();

        // 4. BMI 계산
        double bmi = weight / Math.pow(height/100, 2);

        System.out.printf("%s님의 BMI 지수는 %.2fkg/㎡ 입니다.\n",name, bmi);

        s.close();
    }
}
