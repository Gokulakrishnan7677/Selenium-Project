/**
 * Application which encapsulates the details of registered customers of the XYZ shop who buy Items
 * @author lsethuraj
 * @since version 1.0
 */
public class Customer {
	//Fields
	private String name;
	private String idNo;
	private double balance;
	private Item item;
	//Constructor
	public Customer(String name, String idNo, double balance, Item items) {
		this.name = name;
		this.idNo = idNo;
		this.balance = balance;
		this.item = null;
	}
	 public Customer(String name, String idNo,double balance) {
		 this.name = name;
	        this.idNo = idNo;
	        this.balance = 5000; // Default balance if not specified
	        this.item = null;
	  }
	//Getteres and setters method
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void print() {
        if (item != null) {
            System.out.println("ItemName : " + item.getItemName());
            System.out.println("ItemId : " + item.getItemIdNo());
            System.out.println("ItemQuantity: " + item.getItemQuaity());
            System.out.println("ItemPrice : " + item.getItemPrice());
            System.out.println("Balance : " + balance);
        }
    }

    public void buyItem(Item item) {
        if (item.getItemQuaity() < 1) {
            System.out.println("Order Not Valid");
        } else if (balance >= item.getItemPrice() && item.getItemQuaity() >= 1) {
            balance -= item.getItemPrice();
            this.item = item;
            System.out.println("ItemName : " + item.getItemName());
            System.out.println("ItemId : " + item.getItemIdNo());
            System.out.println("ItemQuantity: " + item.getItemQuaity());
            System.out.println("ItemPrice : " + item.getItemPrice());
            System.out.println("Balance : " + balance);
        } else if (balance < item.getItemPrice()) {
            System.out.println("Insufficient balance");
        }
    }
}
