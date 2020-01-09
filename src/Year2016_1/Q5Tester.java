package Year2016_1;

public class Q5Tester {
    public static void main(String[] args) {
        Q5Rebate a = new Q5Rebate("Ahmad", 1234123412341234L);
        Q5Point b = new Q5Point("Ahmad", 4321432143214321L);
        a.getReward("Grocery", "Saturday", 124.8);
        a.getReward("Other", "Friday", 64.6);
        a.getReward("Fuel", "Sunday", 95.4);
        a.getReward("Utility", "Friday", 100.00);
        a.getReward("Other", "Tuesday", 220.00);
        b.getReward("Grocery", "Saturday", 124.8);
        b.getReward("Other", "Friday", 64.6);
        b.getReward("Fuel", "Sunday", 95.4);
        b.getReward("Utility", "Friday", 100.00);
        b.getReward("Other", "Tuesday", 220.00);
        System.out.println(a.toString());
        System.out.println(b.toString());
        if(a.getTotalCashReward()>b.getTotalCashReward()){
            System.out.println("The best card is " + a.getTypeOfCard());
        }else{
            System.out.println("The best card is " + b.getTypeOfCard());
        }
    }
}
