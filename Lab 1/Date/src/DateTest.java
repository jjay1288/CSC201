//Ronald Phillips

import java.util.Scanner;

public class DateTest {

	public static void main(String[] args) {
	      Scanner input = new Scanner(System.in);
	      
			System.out.print("Enter Month: "); // prompt
		      int month = input.nextInt(); // obtain user input
		      System.out.print("Enter Day: "); // prompt
		      int day = input.nextInt(); // obtain user input
		      System.out.print("Enter Year: "); // prompt
		      int year = input.nextInt(); // obtain user input
		      
		      Date date=new Date(month, day, year);
		      
		      System.out.println("The current date is: "+date.displayDate());

	}

}
