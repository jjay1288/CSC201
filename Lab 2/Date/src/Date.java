
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;


public class Date {


	Calendar calendar = Calendar.getInstance();

	public Date(int month, int day, int year){
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, month-1);
		calendar.set(Calendar.DATE, day);

	}

	public Date(String monthname, int day, int year){

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_MONTH, day);
		int month=getMonthNumber(monthname);
		calendar.set(Calendar.MONTH, month-1);


	}

	public Date(int dayofyear, int year){

		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.DAY_OF_YEAR, dayofyear);

	}

	private int getMonthNumber(String monthName) {
		return Month.valueOf(monthName.toUpperCase()).getValue();
	}

	public void displayDate(){
		
		SimpleDateFormat dateFormat1 = new SimpleDateFormat("MM/dd/YYYY");
		System.out.println(dateFormat1.format(calendar.getTime()));
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("EEEEE, MMM d, yyyy");
		System.out.println(dateFormat2.format(calendar.getTime()));
		SimpleDateFormat dateFormat3 = new SimpleDateFormat("DDD,yyyy");
		System.out.println(dateFormat3.format(calendar.getTime()));
		
	}
	
}
