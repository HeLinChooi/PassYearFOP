package Year2019_2;

import java.util.Random;
import java.util.Scanner;

public class Q3 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random r = new Random();
        String reply;
        do {
            int num1 = r.nextInt(10);
            int num2 = r.nextInt(10);
            System.out.printf("What is %d + %d ? ", num1, num2);
            int ans = s.nextInt();
            boolean correct = (num1 + num2 == ans) ? true : false;
            System.out.printf("%d + %d = %d is %b\n", num1, num2, ans, correct);
            System.out.print("Do you want to try another question (y/n)? : ");
            s.nextLine();
            reply = s.nextLine();
        } while (reply.equals("y"));
        System.out.println("Program ends");
    }
}
