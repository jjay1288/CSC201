//Ronald Phillips
public class Invoice {
	
	   private String partnumber; // instance variable 
	   private double price; // instance variable 
	   private String itemdes;
	   private int quant;
	   
	   // Invoice constructor that receives two parameters  
	   public Invoice(String partnumber, String itemdes, double price, int quant) 
	   {
	      this.partnumber = partnumber; // assign name to instance variable name
	      this.itemdes = itemdes;
	      if(price>0)
	      this.price = price;
	      if (quant>0)
	      this.quant = quant;

	   }
	   
	   // method that sets the partnumber
	   public void setPartnum(String partnum)
	   {
	      this.partnumber = partnum; 
	   } 

	   // method that returns the partnumber
	   public String getPartnum()
	   {
	      return partnumber; 
	   } 

	   // method that sets the price
	   public void setPrice(double price)
	   {
		   if (price>0)
	      this.price = price; 
	   } 

	   // method that returns the price
	   public double getPrice()
	   {
	      return price; 
	   } 

	   // method that sets the item description
	   public void setItemdes(String itemdes)
	   {
	      this.itemdes = itemdes; 
	   } 

	   // method that returns the item description
	   public String getItemdes()
	   {
	      return itemdes; 
	   } 

	   // method that sets the quantity
	   public void setQuant(int quant)
	   {
		   if(quant>0)
	      this.quant = quant; 
	   } 

	   // method that returns the partnumber
	   public int getQuant()
	   {
	      return quant; 
	   } 

	   public double getInvoiceAmount()//calculates invoice amount
	   {

			  return (price * quant);

	   } 
	   
}
