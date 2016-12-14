//Ronald Phillips
import java.util.Scanner;
	
public class InvoiceTest {

	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      
		System.out.print("Enter Item Number for Invoice 1: "); // prompt
	      String itemnum = input.next(); // obtain user input
	      System.out.print("Enter Item description for Invoice 1: "); // prompt
	      String desc = input.next(); // obtain user input
	      System.out.print("Enter Item quantity for Invoice 1: "); // prompt
	      int quant = input.nextInt(); // obtain user input
	      System.out.print("Enter Item price for Invoice 1: "); // prompt
	      double price = input.nextDouble(); // obtain user input
		
	      Invoice invoice1 = new Invoice(itemnum, desc, price, quant);//creates invoice 1
		
			System.out.print("Enter Item Number for Invoice 2: "); // prompt
		      itemnum = input.next(); // obtain user input
		      System.out.print("Enter Item description for Invoice 2: "); // prompt
		      desc = input.next(); // obtain user input
		      System.out.print("Enter Item quantity for Invoice 2: "); // prompt
		     quant = input.nextInt(); // obtain user input
		      System.out.print("Enter Item price for Invoice 2: "); // prompt
		      price = input.nextDouble(); // obtain user input
			
		      Invoice invoice2 = new Invoice(itemnum, desc, price, quant);//creates invoice 2
		

		     //Display Invoice1
		      System.out.println("Item Number: "+invoice1.getPartnum());
		      System.out.println("Item Description: "+invoice1.getItemdes());
		      System.out.println("Item Price: "+invoice1.getPrice());
		      System.out.println("Item Quantity: "+invoice1.getQuant());
		      System.out.println("Invoive Total: "+invoice1.getInvoiceAmount()+"\n");
		      
		      //Display Invoice2
		      System.out.println("Item Number: "+invoice2.getPartnum());
		      System.out.println("Item Description: "+invoice2.getItemdes());
		      System.out.println("Item Price: "+invoice2.getPrice());
		      System.out.println("Item Quantity: "+invoice2.getQuant());
		      System.out.println("Invoice Total: "+invoice2.getInvoiceAmount()+"\n");
		
	}

}
