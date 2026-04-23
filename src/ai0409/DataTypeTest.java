package ai0409;

//기본자료형
public class DataTypeTest {
    public static void main(String[] args) {
        //1. 숫자형
        byte bt = -128; //-128 ~ 127 (ex: 128 대입 오버플로우 ,-129대입 언더플로우)
        short st = 300;
        st = bt; //(bt에 st를 대입은 불가능)
        int it = st;
        System.out.println("it변수에 저장된 값: " + it);
        long lg = 70000000;


        //2. 숫자형:실수형
       float f1 = 1000;
       f1 = lg;
       f1 = 1000.0f;
       f1 = 1000.0f;
       f1 = (float) 1000.0;

       double d1 = 20000;
       d1 = f1;
       d1 = bt;
       d1 = 207.999;


       //3. 숫자가 아닌형: 문자형
        char c = 'A';
        System.out.println(c);
        System.out.println((int)c);
        System.out.println((char)(c+1)); //unidoe 값을 연산할 수 있다.


        //4. 숫자가 아닌형: 논리형
        boolean b = true;

        System.out.println(b);
        System.out.println(!b);

        System.out.println(bt == st);

    }
}
