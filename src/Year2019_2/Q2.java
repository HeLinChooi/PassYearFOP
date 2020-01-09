package Year2019_2;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of bags sold : ");
        int num = s.nextInt();
        double totalPrice;
        System.out.print("Enter teh weight per bag (kilogram) : ");
        double weight = s.nextDouble();
        System.out.println("");
        totalPrice = weight*5.99*num;
        System.out.println("Price per kilogram :\t$" + 5.99);
        System.out.println("Sales tax :\t\t " + 7.25 + "%");
        System.out.println("Toatl price :\t\t$ " + String.format("%.2f",totalPrice+totalPrice*0.0725));
    }
}
