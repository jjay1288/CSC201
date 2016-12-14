//Ronald Phillips
public class Employ {
	
String firstname;
String lastname;
double salary;
double newsalary;

	   // Employ constructor that receives 3 parameters  
	   public Employ(String firstname, String lastname, double salary) 
	   {
	      this.firstname = firstname; // assign name to instance variable name
	      this.lastname = lastname;
	      if (salary>0)
	      this.salary = salary;

	   }
	
	   // method that sets the firstname
	   public void setFirstname(String fname)
	   {
	      this.firstname = fname; 
	   } 

	   // method that returns the fname
	   public String getFirstname()
	   {
	      return firstname; 
	   } 

	   // method that sets the lname
	   public void setLastname(String lname)
	   {
	      this.lastname = lname; 
	   } 

	   // method that returns the lname
	   public String getLastname()
	   {
	      return lastname; 
	   } 
	
	   // method that sets the salary
	   public void setSalary(double salary)
	   {
		   if (salary>0)
	      this.salary = salary;
	   } 

	   // method that returns the salary
	   public double getSalary()
	   {
	      return salary; 
	   } 
	   
	   public double calcRaise()
	   {
		   newsalary=(salary*.10)+salary;
		   return newsalary;
	   }
}
