package Year2017_2;

import java.util.Random;

public class Q3 {
//do approximation to nearest 100

    public static void main(String[] args) {
        Random r = new Random();
        int ran = r.nextInt(10001);
//        int ran = 150;
//        int digit = ran / 10 % 10;
//        int result = ran;
//        if (digit >= 5) {
//            result = result / 100 * 100 + 100;
//        } else {
//            result = result / 100 * 100;
//        }
        System.out.println(ran);
//        System.out.println(result);
//a lot simpler
        int initial = ran;
        int rounded = (int) Math.round(initial / 1000.0) * 1000;
        System.out.println("2nd method: " + rounded);
    }
}
