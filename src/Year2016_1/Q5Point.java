package Year2016_1;

public class Q5Point extends Q5CreditCard{

    public Q5Point(String name, long cardNum) {
        super(name, cardNum);
        this.typeOfCard = "Point Reward Card";
    }
     public double getReward(String type, String day, double total) {
         int points = (int)total*100/100;
        switch (day) {
            case "Friday":
                this.totalCashReward += points*2 * 0.01;
                break;
            case "Saturday":
                this.totalCashReward += points*3 * 0.01;
                break;
            case "Sunday":
                this.totalCashReward += points*4 * 0.01;
                break;
            default:
                this.totalCashReward += points * 0.01;
        }
        return this.totalCashReward;
    }
}
