//Ronald Phillips
public class OutofOrder {

	public static void main(String[] args) throws Exception {
		int foo=1;
		int bar=2;

		try{
			foo=bar;

		}
		catch (Exception exception){
			foo=bar*2;
		}
		catch (ArithmeticException exception){
			foo = bar*3;
		}
	}

}
