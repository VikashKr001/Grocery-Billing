package GroceryBilling;

public class SoldProduct 
{
	private int productId;
	private int qty;

	    public SoldProduct() {
	    }

	    public SoldProduct(int productId, int qty) {
	        this.productId = productId;
	        this.qty = qty;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public int getQty() {
	        return qty;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public void setQty(int qty) {
	        this.qty = qty;
	    }

	    @Override
	    public String toString() {
	        return "productId=" + productId + ", qty=" + qty;
	    }
}
