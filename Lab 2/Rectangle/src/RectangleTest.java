//Ronald Phillips
import java.util.Scanner;

public class RectangleTest {
		
	public static void main(String[] args) {

		
		Rectangle rect=new Rectangle(1,1);
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter the length of the Rectangle");
		rect.setLength(input.nextDouble());
		System.out.println("Please enter the width of the Rectangle");
		rect.setWidth(input.nextDouble());;

		
		
		System.out.println("The Area of the rectangle is: "+rect.calcArea());
		System.out.println("The Perimeter of the rectangle is: "+rect.calcPerim());
		
		
	}

}
