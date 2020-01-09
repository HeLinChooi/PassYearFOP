package Year2019_2;
//Emily's answer
public class Q6ShippedOrder extends Q6Order {

    public Q6ShippedOrder() {
    }

    public Q6ShippedOrder(String customerName, String customerID, int quantityOrder, double unitPrice) {
        super(customerName, customerID, quantityOrder, unitPrice);
    }

    @Override
    public double computeTotalPrice() {
        return quantityOrder * unitPrice + 4;
    }

    public String toString() {
        return "Shipped\n Order Record\n" + "Customer Name : " + customerName + "\nCustomer ID : " + customerID + "\nQuantity Order : " + quantityOrder + "\nUnitPrice : " + unitPrice;
    }

}