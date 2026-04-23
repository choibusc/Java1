package ai0326;

import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("==택배 접수==");

        // 받는 사람
        System.out.print("받는 사람 : ");
        String name = s.nextLine();

        //주소
        System.out.print("주소 : ");
        String address = s.nextLine();

        // 택배 무게
        System.out.print("무게 (g) : ");
        int weight = s.nextInt();

        int shippingFee = weight * 5;

        System.out.println(); //한줄 띄우기
        System.out.println("받는 사람 ==> " + name);
        System.out.println("배송 주소 ==> " + address);
        System.out.println("택배 무게 ==> " + weight + "g");
        System.out.println("총 배송비 ==> " + shippingFee + "원");

    }
}
