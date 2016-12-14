
public class DateTest {

	public static void main(String[] args) {

		Date d1=new Date(12,8,1988);
		Date d2=new Date("March",21,1991);
		Date d3=new Date(321,1955);
		System.out.println("'12,8,1988' passed to constructor");
		d1.displayDate();
		System.out.println("'December,8,1988' passed to constructor");
		d2.displayDate();
		System.out.println("'343,1988' passed to constructor");
		d3.displayDate();
	}

}
