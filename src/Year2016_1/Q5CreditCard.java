package Year2016_1;

public class Q5CreditCard {
    private String name;
    private long cardNum;
    protected String typeOfCard;
    protected double totalCashReward;

    public Q5CreditCard(String name, long cardNum) {
        this.name = name;
        this.cardNum = cardNum;
    }

    public double getTotalCashReward() {
        return totalCashReward;
    }

    public void setTotalCashReward(double totalCashReward) {
        this.totalCashReward = totalCashReward;
    }

    public String getTypeOfCard() {
        return typeOfCard;
    }

    @Override
    public String toString() {
        String totalReward;
        if(totalCashReward==(int)totalCashReward){
            totalReward = String.format("\nTotal Cash Reward : %.1f",totalCashReward);
        }else{
            totalReward = String.format("\nTotal Cash Reward : %.4f",totalCashReward);
        }
        return "Credit Card : " + name 
                + " (" + cardNum + ")"
                + "\nCard Type : " + typeOfCard 
                + totalReward;
    }
    
}

