package GroceryBilling;

public class ProductDB
{
	private Product p[];
	private int cntP;
	
	public ProductDB()
	{
		cntP=10;
        p=new Product[cntP];
        p[0]=new Product(0,"Oil",87.5f,100);
        p[1]=new Product(1,"Sugar",37,1000);
        p[2]=new Product(2,"Wheat",24,1000);
        p[3]=new Product(3,"Rice",55,1000);
        p[4]=new Product(4,"Colgate Paste",52,10);
        p[5]=new Product(5,"Lux Soap",28,50);
        p[6]=new Product(6,"Tea Powder",110,10);
        p[7]=new Product(7,"Salt", 18,35);
        p[8]=new Product(8,"Tur Dal",65.5f,150);
        p[9]=new Product(9,"Pickle",22,15);
	}//Default Constructor
	public int count()
	{
		return cntP;
	}//count method
	Product getProduct(int index)
	{
		return p[index];
	}//getProduct method
	void setProduct(Product pp,int index)
	{
		p[index]=pp;
	}//setProduct method
	
}//class ProductDB
