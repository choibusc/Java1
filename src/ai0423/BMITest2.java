package ai0423;

import java.util.Scanner;

public class BMITest2 {
    public static void main(String[] args) {

        Scanner s1 = new Scanner(System.in);

        System.out.print("* 키(cm) 입력: ");
        double height = s1.nextDouble();

        System.out.print("* 몸무게(kg) 입력: ");
        double weight = s1.nextDouble();

        System.out.print("* 성영 임력:");
        String name = s1.nextLine();

        double bmi = weight / Math.pow(height/100, 2); //((height/100)*(height/100))
        String result1, result2;

        if(bmi < 18.5){
            result1 = "저";
            result2 = "식단과 운동을 통해 체중을 증량시켜야 함니다. 생영에 위험이 있을 수도 있습니다.";
        }else if(bmi < 22.9){
            result1 = "전상";
            result2 = "현재 체중을 유지하시기 바람니다.";
        }else if(bmi < 24.9) {
            result1 = "2";
            result2 = "식단과 운동을 통해 체종을 감량하시기 바람니다.";
        }else if(bmi < 29.9) {
            result1 = "비만";
            result2 = "식단과 운동을 통해 체중을 감량하시기 바랍니다. 성인병 유발에 원인이 될 수 있습니다.";
        }else {
            result1 = "고도비만";
            result2 = "전문가의 도움을 받다 식단과 운동을 통해 체중을 반드시 감량하시기 바랍니다. 고혈합, 고지형증, 당뇨변이 발생 될 수 있습니다.";
        }
        System.out.printf("* %s님의 BMI 지수 결과: %.2fkg/m2이므로 %s체중임니다.\n",name, bmi, result1);
        System.out.printf("*%s2 %s", result1, result2);

        s1.close();
    }
}
