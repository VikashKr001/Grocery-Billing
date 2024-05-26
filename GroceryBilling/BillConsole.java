package GroceryBilling;

import java.util.Scanner;

public class BillConsole {
	Scanner sc=new Scanner(System.in);
	private BillDB bd;
	private ProductDB pd;

	public BillConsole() {
		super();
		bd = new BillDB();
		pd = new ProductDB();
	}

	int menu() {
		int choice = 0;
		System.out.println("1--->Make a Bill");
		System.out.println("2--->Display All Bills");
		System.out.println("3--->Exit");
		System.out.println("Enter your choice");

		try {
			choice = sc.nextInt();
		} catch (Exception e) {
		}
		return choice;
	}

	public void start() {
		while (true) {
			String cName,mNo,productName="";
			int i,id = 0,stock=0,pQuantity=0;
			Bill b1;
			SoldProduct sp1;
			int choice = menu();
			switch (choice) {
			case 1: // Make a Bill
				System.out.println("Enter customer name: ");
				cName=sc.next();
				System.out.println("Enter mobile number: ");
				mNo=sc.next();
				while(true)
				{
				System.out.println("List of products :");
				for (i = 0; i < pd.count(); i++)
					pd.getProduct(i).displayProduct();
				
				System.out.println("Enter id of product to buy or -1 to stop :");
				id=sc.nextInt();
				if(id==-1)
					break;
				
				stock=pd.getProduct(id).getStock();
				productName=pd.getProduct(id).getName();
				
				System.out.println("Stock of "+productName+" is "+stock);
				System.out.println("Enter quantity you required :");
				pQuantity=sc.nextInt();
				if(pQuantity>stock)
				{
					System.out.println("Sorry...Out of stock !! ");
					System.out.println("Only "+stock+", "+productName+" are available.");
					break;
				}
				System.out.println("\tBill details :");
				
				System.out.println("Product: "+productName+"\nPrice: "+pd.getProduct(id).getPrice());
				System.out.println("Quantity: "+pQuantity+"\nTotal:"+(pd.getProduct(id).getPrice())*pQuantity);
				b1=new Bill(cName,mNo);
				bd.addBill(b1);
				sp1=new SoldProduct(id,pQuantity);
				bd.getBill(id).getSoldProductDB().addSoldProduct(sp1);
				}//while
				break;
			case 2: // Display all Bills
				for(i=0;i<bd.count();i++)
					bd.getBill(i).toString();
					
					break;
			case 3://Exit
				System.out.println("Thanks...visit again !");
				System.exit(0);
				break;
			default:
				System.out.println("You entered wrong choice");
			}
		}

	}// start
}// class BillConsole
