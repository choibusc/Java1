package ai0423;

import java.util.Scanner;

public class PCcafe {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("=== 밤 10시 이후 PC방 출입 확인 프로그램 ===");
        System.out.print("나이를 입력하세요: ");

        int age = s.nextInt();

        if (age > 19) {
            System.out.println("성인입니다. 밤 10시 이후에도 이용이 가능합니다!");
        } else {
            System.out.println("청소년입니다. 밤 10시 이후에는 이용하실 수 없습니다.");
        }

        s.close();

    }
}
