//Ronald Phillips
public class Date {
private int month;
private int day;
private int year;
	
	   public Date(int month, int day, int year) 
	   {
	      this.month = month; // assign name to instance variable name
	      this.day = day;
	      this.year = year;

	   }
	
	   
	   // method that sets the day
	   public void setDay(int day)
	   {
	      this.day = day; 
	   } 

	   // method that returns the day
	   public int getDay()
	   {
	      return day; 
	   } 
	   
	   // method that sets the month
	   public void setMonth(int month)
	   {
	      this.month = month; 
	   } 

	   // method that returns the month
	   public int getMonth()
	   {
	      return month; 
	   } 
	   
	   // method that sets the year
	   public void setYear(int year)
	   {
	      this.year = year; 
	   } 

	   // method that returns the month
	   public int getYear()
	   {
	      return year; 
	   } 
	   
	   public String displayDate()
	   {
	      return (month+"/"+day+"/"+year+"\n"); 
	   } 
}
