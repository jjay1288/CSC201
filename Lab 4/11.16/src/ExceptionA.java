//Ronald Phillips
public class ExceptionA extends Exception{
	private String type;
	private String detail;

	public ExceptionA (String type, String detail){
		this.type=type;
		this.detail=detail;
	}

	public static void ThrowExceptionA() throws ExceptionA{

		ExceptionB.ThrowExceptionB();

	}


	public static void main(String[] args) {
		try{
			ExceptionA.ThrowExceptionA();
		}
		catch  (ExceptionA exception){
			System.err.printf("%s%n%n", exception.getMessage());
			exception.printStackTrace();

			StackTraceElement[] traceElements = exception.getStackTrace();

			System.out.printf("%nStack trace:%n");
			System.out.println("Class\t\tFile\t\tLine\tMethod");

			for(StackTraceElement element : traceElements)
			{
				System.out.printf("%s\t", element.getClassName());
				System.out.printf("%s\t", element.getFileName());
				System.out.printf("%s\t", element.getLineNumber());
				System.out.printf("%s%n", element.getMethodName());
			}
		}

	}

}
