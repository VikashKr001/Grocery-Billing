package GroceryBilling;

public class Product
{
	private int id,stock;
	private String name;
	private float price;
	
	public Product()
	{
		super();
	}//Default constructor

	public Product(int id, String name, float price, int stock)
	{
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.stock = stock;
	}//Parameterized constructor
	
	void displayProduct()
	{
		System.out.println("id: "+id+",name: "+name+",price: "+price+",stock: "+stock);
	}
	
	//Setter and Getter methods

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
		
}//class Product 
