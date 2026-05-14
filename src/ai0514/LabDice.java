package ai0514;

public class LabDice {
    public static void main(String[] args) {
        int d1, d2, d3;
        int count = 0;

        while (true) {
            d1 = (int)(Math.random() * 6) + 1;
            d2 = (int)(Math.random() * 6) + 1;
            d3 = (int)(Math.random() * 6) + 1;

            count++;

            if (d1 == d2 && d2 == d3) {
                break;
            }
        }

        System.out.println("3개 주사위는 모두 " + d1 + "입니다.");
        System.out.println("같은 숫자가 나올 때까지 " + count + "번 던졌습니다.");
    }
}
