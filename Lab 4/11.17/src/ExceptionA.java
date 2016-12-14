//Ronald Phillips
public class ExceptionA extends Exception{
	private String type;
	private String detail;

	public ExceptionA(String type, String detail){
		this.type=type;
		this.detail=detail;
	}

	public static void ThrowExceptionB() throws ExceptionB{
		ExceptionB.ThrowExceptionB();

	}
	public static void ThrowExceptionA() throws ExceptionA{
		throw new ExceptionA("ExceptionA", "Exception in ExceptionA.java");
	}
}
