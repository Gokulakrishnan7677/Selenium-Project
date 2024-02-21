/**
 * Application to encapsulate the details of items to be purchased by the customer of the XYZ shop 
 * @author lsethuraj
 * @since version 1.0
 */
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class OrderNotValidException extends Exception {
    public OrderNotValidException(String message) {
        super(message);
    }
}
public class Item {
	//Fields
		private String itemName;
		private String itemIdNo;
		private int itemQuanity;
		private double itemPrice;
	//Constructor
		public Item(String itemName, String itemIdNo, int itemQuanity, double itemPrice) {
			this.itemName = itemName;
			this.itemIdNo = itemIdNo;
			this.itemQuanity = itemQuanity;
			this.itemPrice = itemPrice;
		}
		public Item(String itemName, String itemIdNo, int itemQuantity) {
	        this(itemName, itemIdNo, itemQuantity, 500); // Default price if not specified
	    }

	    public Item(String itemName, String itemIdNo) {
	        this(itemName, itemIdNo, 0); // Default quantity and price
	    }
	    //Getters and setters method
		public String getItemName() {
			return itemName;
		}
		public void setItemName(String itemName) {
			this.itemName = itemName;
		}
		public String getItemIdNo() {
			return itemIdNo;
		}
		public void setItemIdNo(String itemIdNo) {
			this.itemIdNo = itemIdNo;
		}
		public int getItemQuaity() {
			return itemQuanity;
		}
		public void setItemQuaity(int itemQuaity) {
			this.itemQuanity = itemQuanity;
		}
		public double getItemPrice() {
			return itemPrice;
		}
		
		public void setItemPrice(double itemPrice) {
			this.itemPrice = itemPrice;
		}
}
