package Year2019_1;

public class Q5Tester {
    public double totalShippingCost(Q5Delivery...x){
        double total = 0;
        for (int i = 0; i < x.length; i++) {
//            System.out.println("This object total cost:" +x[i].totalCost());
            total += x[i].totalCost();
        }
        return total;
    }
    public static void main(String[] args) {
        Q5Delivery a = new Q5Delivery("Ali", "Ahmad", 4.4);
        Q5Delivery b = new Q5Delivery("Ah Chong", "Fatimah", 63.1);
        Q5SpecialDelivery c = new Q5SpecialDelivery(true, false, "FSKTM, UM", "FK UM", 32.5);
        Q5SpecialDelivery d = new Q5SpecialDelivery(true, true, "Ang", "Liew", 19.0);
        System.out.println(a.toString());
        System.out.println("\n" + b.toString());
        System.out.println("\n" + c.toString());
        System.out.println("\n" + d.toString());
        Q5Tester obj = new Q5Tester();
        System.out.println("");
        System.out.println("The total shipping cost is RM " + obj.totalShippingCost(a,b,c,d));
    }
    
}
