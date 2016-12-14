//Ronald Phillips
public class ExceptionB extends ExceptionA{

	public ExceptionB (String type, String detail){
		super(type, detail);

	}

	public static void ThrowExceptionB() throws ExceptionB{

		throw new ExceptionB("ExceptionB","Exception in ExceptionB.java");

	}

}
