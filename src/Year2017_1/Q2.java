package Year2017_1;

public class Q2 {
    public static double computeFee(double initial,double rate,int year){
        //the initial fee is for year 1
        double result = initial;
        for (int i = 2; i <= year; i++) {
            result = result*1.052;
//            result = Double.parseDouble(String.format("%.2f", result*1.052));
        }
//        return result;
          return Double.parseDouble(String.format("%.2f", result));
    }
    public static void main(String[] args) {
        System.out.println(computeFee(100, 5.2, 3));
    }
}
