package GroceryBilling;

public class BillDB
{
	private Bill b[];
	private int cnt;
	
	public BillDB()
	{
		super();
		b=new Bill[20];
		cnt=0;
	}//Default constructor
	int count()
	{
		return cnt;
	}//count method
	void addBill(Bill bill)
	{
		b[cnt]=bill;
		cnt++;
	}//addBill method
	Bill getBill(int index)
	{
		return b[index];
	}//getBill method
	
}//class BillDB
