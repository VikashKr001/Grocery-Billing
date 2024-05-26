package GroceryBilling;

public class Bill
{
	private String customer;
    private String mobileno;
    private int billno;
    private float gtotal;
    private SoldProductDB spdb = new SoldProductDB();
    public void setBillno(int billno) {
        this.billno = billno;
    }
    Bill(String customer, String mobileno)
    {
        this.customer=customer;
        this.mobileno=mobileno;
        
    }
     public float getGtotal() {
               return gtotal;
    }
    public String getCustomer() {
        return customer;
    }
    public String getMobileno() {
        return mobileno;
    }
    public SoldProductDB getSoldProductDB()
    {
        return this.spdb;
    }
    public void setGTotal(float gtotal) {
        this.gtotal = gtotal;
    }
    public String toString()
    {
        return ("Bill Number: "+(billno)+".--->"+customer + " " + mobileno+"    Amount:"+gtotal);
    }
	
}//class Bill
