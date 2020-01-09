package Year2019_2;
//Emily's Answer
public class Q6Order {

    protected String customerName, customerID;
    protected int quantityOrder;
    protected double unitPrice;

    public Q6Order() {
        this.customerID = this.customerName = null;
        this.quantityOrder = 0;
        this.unitPrice = 0;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerID() {
        return customerID;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }

    public int getQuantityOrder() {
        return quantityOrder;
    }

    public void setQuantityOrder(int quantityOrder) {
        this.quantityOrder = quantityOrder;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Q6Order(String customerName, String customerID, int quantityOrder, double unitPrice) {
        this.customerName = customerName;
        this.customerID = customerID;
        this.quantityOrder = quantityOrder;
        this.unitPrice = unitPrice;
    }
    
    public double computeTotalPrice(){
        return quantityOrder * unitPrice;
    }

    @Override
    public String toString() {
        return "Order record\n" + "Customer Name : " + customerName + "\nCustomer ID : " + customerID + "\nQuantity Order : " + quantityOrder + "\nUnitPrice : " + unitPrice;
    }

}
