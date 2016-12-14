//Ronald Phillips

import java.util.Scanner;

public class EmployTest {

	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);

		System.out.print("Enter Employee 1 First Name: "); // prompt
	      String fname = input.next(); // obtain user input
	      System.out.print("Enter Employee 1 Last Name: "); // prompt
	      String lname = input.next(); // obtain user input
	      System.out.print("Enter Employee 1 Salary: "); // prompt
	      double salary = input.nextInt(); // obtain user input
	      
	      Employ employee1 = new Employ(fname, lname, salary);
	      
			System.out.print("Enter Employee 2 First Name: "); // prompt
		      fname = input.next(); // obtain user input
		      System.out.print("Enter Employee 2 Last Name: "); // prompt
		      lname = input.next(); // obtain user input
		      System.out.print("Enter Employee 2 Salary: "); // prompt
		      salary = input.nextInt(); // obtain user input
		      
		      Employ employee2 = new Employ(fname, lname, salary);
		      
		      
System.out.println("Employee Name: "+employee1.getFirstname()+" "+employee1.getLastname()+"\n");
System.out.println("Employee's Old Salary: "+employee1.getSalary()+"\n");

employee1.setSalary(employee1.calcRaise());//Gives Raise

System.out.println("Employee New Salary: "+employee1.getSalary()+"\n");

System.out.println("Employee Name: "+employee2.getFirstname()+" "+employee2.getLastname()+"\n");
System.out.println("Employee's Old Salary: "+employee2.getSalary()+"\n");

employee2.setSalary(employee2.calcRaise());//Gives raise

System.out.println("Employee New Salary: "+employee2.getSalary()+"\n");


	      
	      


	}

}
