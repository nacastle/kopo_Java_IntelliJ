package lecture.day11.Exception;

import java.util.Random;

public class ExceptionMain01 {

    public static void main(String[] args) {

        System.out.println("main start...");

        try {
            Random r = new Random();
            int num = r.nextInt(2);

            System.out.println("추출된 난수 : " + num);
            System.out.println(10 / num);
        } catch(ArithmeticException ae) {
//            System.out.println("예외발생!!!");
			System.out.println("발생이유 : " + ae.getMessage());
//            ae.printStackTrace();
        }

        System.out.println("main end...");
    }


}
