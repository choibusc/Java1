package ai0402;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Simple Calculator ---");

        System.out.print("첫 번째 정수 입력==> ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수 입력==> ");
        int num2 = sc.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2, num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1 - num2);
        System.out.printf("%d x %d = %d\n", num1, num2, num1 * num2);
        System.out.printf("%d ÷ %d = %.2f\n", num1, num2, (double)num1/num2);
        System.out.printf("%d %% %d = %d\n", num1, num2, num1 % num2);

        /*System.out.println("\n[ 계산 결과 ]");
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " × " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " ÷ " + num2 + " = " + (num1 % num2));*/

        sc.close();
    }
}
