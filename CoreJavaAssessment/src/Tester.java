/**
 * Application to run both Customer and Item class to produce the result
 * @author lsethuraj
 * @since version 1.0
 */
public class Tester {

	public static void main(String[] args) {
		Customer customer = new Customer("JohnAlex", "CID345", 1000); //Creating new customer
		
        Item item1 = new Item("DairyMilkSilk", "IID56", 10, 83); //Creating new item1 instance
        Item item2 = new Item("Pepsi", "IID10", 0, 20);//Creating new item2 instance
        Item item3 = new Item("HenkoLiquid", "IID100", 2, 150);//Creating new item3 instance

        System.out.println("Customer Details"); //Display customer details
        System.out.println("CustomerName : " + customer.getName());
        System.out.println("CustomerId : " + customer.getIdNo());
        System.out.println("CustomerBalance : " + customer.getBalance());

        // Buy and display items
        System.out.println("Item1:");
        customer.buyItem(item1);
        System.out.println("Item2:");
        customer.buyItem(item2);
        System.out.println("Item3:");
        customer.buyItem(item3);

	}

}
