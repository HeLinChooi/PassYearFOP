package Year2020_1;

import java.util.Scanner;

public class Q2 {

    public static void main(String[] args) {
        String[] location1 = inputs();
        String[] location2 = inputs();
        double la1,la2,long1, long2;
        la1 = decimalDegree(location1[0], location1[1], location1[2], location1[3]);
        long1 = decimalDegree(location1[4], location1[5], location1[6], location1[7]);
        la2 = decimalDegree(location2[0], location2[1], location2[2], location2[3]);
        long2 = decimalDegree(location2[4], location2[5], location2[6], location2[7]);
        System.out.println(la1);
        System.out.println(la2);
        System.out.println(long1);
        System.out.println(long2);
        System.out.println(distance(la1, la2, long1, long2));
    }

    static Scanner s = new Scanner(System.in);
    public static String[] inputs() {
        String[] result = new String[8];
        System.out.print("Enter Direction: [N, S, E, W]");
        result[0] = s.next();
        System.out.print("Enter Degree, Minute and Second : ");
        result[1] = Integer.toString(s.nextInt());
        result[2] = Integer.toString(s.nextInt());
        result[3] = Integer.toString(s.nextInt());
//        System.out.println("Get " + result[0] + result[1] + result[2] + result[3]);
        System.out.print("Enter Direction: [N, S, E, W]");
        result[4] = s.next();
        System.out.print("Enter Degree, Minute and Second : ");
        result[5] = Integer.toString(s.nextInt());
        result[6] = Integer.toString(s.nextInt());
        result[7] = Integer.toString(s.nextInt());
//        System.out.println("Get " + result[4] + result[5] + result[6] + result[7]);
        return result;
    }

    public static double decimalDegree(String directionx, String degreex, String minutex, String secondx) {
        System.out.println("yo");
        double decimalDegree;
        String direction = directionx;
        double degree = Double.parseDouble(degreex);
        double minute = Double.parseDouble(minutex);
        double second = Double.parseDouble(secondx);
        decimalDegree = degree + (minute * 60 + second) / 3600;
        switch (direction) {
            case "N":
                break;
            case "S":
                decimalDegree *= -1;
                break;
            case "E":
                break;
            case "W":
                decimalDegree *= -1;
                break;
        }
        return decimalDegree;
    }

    public static double distance(double la1, double la2, double long1, double long2) {
        double a, c, d;
        double laDiff = la1 - la2, longDiff = long1 - long2;
        //convert all of them into radian
        laDiff = laDiff * Math.PI / 180.0;
        longDiff = longDiff * Math.PI / 180.0;
        la1 = la1 * Math.PI / 180.0;
        la2 = la2 * Math.PI / 180.0;
        long1 = long1 * Math.PI / 180.0;
        long2 = long2 * Math.PI / 180.0;
        a = Math.sin(laDiff / 2) * Math.sin(laDiff / 2) + Math.cos(la1) * Math.cos(la2) * Math.sin(longDiff / 2) * Math.sin(longDiff / 2);
        c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        d = 6371 * c;
        return d;
    }
}
