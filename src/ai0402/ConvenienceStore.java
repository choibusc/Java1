package ai0402;

public class ConvenienceStore {
    public static void main(String[] args) {
/*        // 물품별 판매 가격 설정
        int triangleGimbapPrice = 1400;
        int bananaMilkPrice = 1800;
        int lunchBoxPrice = 4000;
        int colaPrice = 1500;
        int shrimpSnackPrice = 2000;
        int cannedCoffeePrice = 1800;

        // 물품별 판매 수량 설정 (문제의 판매 내역 기준)
        int bananaMilkSold = 2;
        int lunchBoxSold = 4;
        int colaSold = 1;
        int shrimpSnackSold = 4;
        int cannedCoffeeSold = 5;

        // 총매출액 계산 (판매 가격 * 판매 수량)
        int totalSales = (bananaMilkPrice * bananaMilkSold) +
                (lunchBoxPrice * lunchBoxSold) +
                (colaPrice * colaSold) +
                (shrimpSnackPrice * shrimpSnackSold) +
                (cannedCoffeePrice * cannedCoffeeSold);

        // 결과 출력
        System.out.printf("오늘 총매출액은 %d원입니다.\n", totalSales);*/

        int total = 0;

        total -= 900 * 10;
        total += 1800 * 2;
        total -= 3500 * 5;
        total += 4000 * 4;
        total += 1500;
        total += 2000 * 4;
        total += 1800 * 5;

        System.out.println("편의점 총 매출액: " + total + "원");
    }
}

