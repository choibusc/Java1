package ai0430;

public class ForTest2 {
    public static void main(String[] args) {

        int hap = 0;

        for (int i = 1; i <= 10; i++) {
            hap += i;
            if(i<10)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
        }

        System.out.println("1부터 10까지의 합: " + hap);
    }
}
