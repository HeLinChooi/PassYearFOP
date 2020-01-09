package Year2019_1;

public class Q5Delivery {
    private String sender;
    private String recipient;
    private double weight;

    public Q5Delivery(String sender, String recipient, double weight) {
        this.sender = sender;
        this.recipient = recipient;
        this.weight = weight;
    }
    public double totalCost(){
        if(this.weight<=5)return this.weight*2.8;
        else if(this.weight>5&&this.weight<=20)return 5*2.8+(this.weight-5)*5.2;
        else if(this.weight>20&&this.weight<=50)return 5*2.8+15*5.2+(this.weight-20)*7;
        else if(this.weight>50)return 5*2.8+15*5.2+30*7+(this.weight-50)*8.6;
        else return 0;
    }

    @Override
    public String toString() {
        return "From : " + sender + " To: " + recipient 
                + "\nWeight of Package : " + weight + " kg"
                + "\nShipping Cost : RM" + this.totalCost();
    }
    
    
}
