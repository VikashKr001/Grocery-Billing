package GroceryBilling;

public class SoldProductDB
{
	private SoldProduct sp [];
	private int cntSP;
	
	public SoldProductDB()
	{
		super();
		sp=new SoldProduct[20];
		cntSP=0;
	}
	int count()
	{
		return cntSP;
	}//count method
	void addSoldProduct(SoldProduct SP)
	{
		sp[cntSP]=SP;
		cntSP++;
	}//addBill method
	SoldProduct soldProduct(int index)
	{
		return sp[index];
	}//getBill method
}
