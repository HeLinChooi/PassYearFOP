package Year2016_1;

public class Q5Rebate extends Q5CreditCard {

    public Q5Rebate(String name, long cardNum) {
        super(name, cardNum);
        this.typeOfCard = "Cash Rebate Card";
    }

    public double getReward(String type, String day, double total) {
        switch (type) {
            case "Fuel":
                this.totalCashReward += total * 0.08;
                break;
            case "Utility":
                this.totalCashReward += total * 0.05;
                break;
            case "Grocery":
                this.totalCashReward += total * 0.02;
                break;
            case "Other":
                this.totalCashReward += total * 0.002;
                break;
        }
        return this.totalCashReward;
    }
}
