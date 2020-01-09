package Year2019_1;

public class Q5SpecialDelivery extends Q5Delivery {

    private boolean weekendDelivery;
    private boolean nightTimeDelivery;

    public Q5SpecialDelivery(boolean weekendDelivery, boolean nightTimeDelivery, String sender, String recipient, double weight) {
        super(sender, recipient, weight);
        this.weekendDelivery = weekendDelivery;
        this.nightTimeDelivery = nightTimeDelivery;
    }

    @Override
    public double totalCost() {
        double total = super.totalCost();
        if (weekendDelivery) {
            total += 50;
        }
        if (nightTimeDelivery) {
            total += total * 0.2;
        }
        String x = String.format("%.2f", total);
        total = Double.parseDouble(x);
        return total;
    }

    @Override
    public String toString() {
        StringBuilder x = new StringBuilder(super.toString());
        x.append((weekendDelivery) ? "\nWeekend Delivery" : "");
        x.append((nightTimeDelivery) ? "\nNight Time Delivery" : "");
        return new String(x);
    }

}
